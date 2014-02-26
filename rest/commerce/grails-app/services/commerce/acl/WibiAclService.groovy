package commerce.acl

import commerce.acl.ApplicationPermissions
import commerce.acl.SupportRole
import commerce.emp.Employee
import commerce.emp.User
import grails.plugin.nimble.InstanceGenerator
import grails.plugin.nimble.core.Permission
import grails.plugin.nimble.core.Role
import grails.plugin.nimble.core.Group
import grails.plugin.nimble.core.UserBase
import grails.transaction.Transactional


// create application service classes that understand their own


@Transactional
class WibiAclService {

    public static final String ADMIN_PERMISSION_PATTERN = "target:'*'"

    def grailsApplication
    def permissionService
    def userService
    def userManagementService
    def roleService

    def init() {

        // TODO: add try catches
        List<WibiRole> roles = [SupportRole, AdminRole, StandardRole, MerchantRole, BackOfficeRole, StoreAdminRole, StoreEmployeeRole, CustomerRole]
        for (_role in roles) {
            Role role = createRole(_role.ROLE_NAME, _role.ROLE_DESC)
            grantStandardPermissionsToRole(_role.getPermissions(), role)
        }
        // handle error

        // create default users
        // create APP user

    }

    def boolean grantPermissionToRole(String permission, Role role, boolean isAdmin) {

        permissionService.createPermission( createPermission(permission, isAdmin), role )

        // handle error
    }

    def boolean grantStandardPermissionsToRole(List<ApplicationPermissions> perms, Role role) {

        if (perms) {
            for (perm in perms) {
                grantPermissionToRole(perm, role, false)
            }
        }

    }

    protected def Permission createPermission(String permission, boolean isAdmin) {

        if (permission) {

            Permission _permission = new Permission(target: (isAdmin ? ADMIN_PERMISSION_PATTERN : permission) )
            _permission.managed = true
            _permission.type = isAdmin ? Permission.adminPerm : Permission.wildcardPerm
            return _permission

        } else {
            throw new RuntimeException("Unable to create valid permission as permission is likely to have been null")
        }

    }

    /*
        A convenience method that allows roles to be created easily.
     */
    def Role createRole(String roleName, String roleDesc) {

        if (roleName && roleDesc) {

            def role = Role.findByName(roleName)
            if (!role) {
                role = new Role(
                        description: roleDesc,
                        name: roleName,
                        protect: true)
                role.save()

                if (role.hasErrors()) {
                    role.errors.each { log.error(it) }
                    throw new RuntimeException("Unable to create valid " + roleName + " role")
                }
            }
            return role

        }

    }


    def Group createGroup(String groupName, String groupDesc) {

        if (groupName && groupDesc) {

            def group = Group.findByName(groupName)
            if (!group) {
                group = new Group(
                        description: groupDesc,
                        name: groupName,
                        protect: true)
                group.save()

                if (group.hasErrors()) {
                    group.errors.each { log.error(it) }
                    throw new RuntimeException("Unable to create valid " + groupName + " group")
                }
            }
            return group

        }
    }


    def UserBase createUser(User account, Employee employee, List<String> roles) {


        if(!UserBase.findByUsername("user")) {

            def user = InstanceGenerator.user(grailsApplication)
            user.username = account.username
            user.pass = account.pass
            user.passConfirm = account.passConfirm
            user.passwordSalt = userManagementService.generatePasswordSalt()
            user.passwordHash = userManagementService.generatePasswordHash(user.pass, user.passwordSalt)
            user.enabled = true
            user.remoteapi = account.remoteapi

            def userProfile = InstanceGenerator.profile(grailsApplication)
            userProfile.firstName = employee.firstName
            userProfile.lastName = employee.lastName
            userProfile.fullName = userProfile.firstName + " " + userProfile.lastName
            userProfile.owner = user
            user.profile = employee

            log.info("Creating default user account with username:" + account.username)

            def savedUser = userService.createUser(user)
            if (savedUser.hasErrors()) {
                savedUser.errors.each { log.error(it) }
                throw new RuntimeException("Error creating example user")
            }

            // add savedUser to roles
            for (role in roles) {
                roleService.addMember(savedUser, role)
            }
        }

    }
}
