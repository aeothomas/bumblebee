package commerce.acl

import commerce.acl.ApplicationPermissions
import commerce.acl.SupportRole
import grails.plugin.nimble.core.Permission
import grails.plugin.nimble.core.Role
import grails.plugin.nimble.core.Group
import grails.transaction.Transactional


// create application service classes that understand their own


@Transactional
class WibiAclService {

    public static final String SUPPORT_ROLE = "SUPPORT"
    public static final String MERCHANT_ROLE = "MERCHANT"
    public static final String BACK_OFFICE_ROLE = "BACK OFFICE"
    public static final String STORE_ADMIN_ROLE = "STORE ADMIN"
    public static final String STORE_EMPLOYEE_ROLE = "STORE EMPLOYEE"
    public static final String CUSTOMER_ROLE = "CUSTOMER"
    public static final String STANDARD_ROLE = "STANDARD"

    public static final String REGISTER_APP_GROUP = "REGISTER_APP_GROUP"
    public static final String BACK_OFFICE_APP_GROUP = "BACK_OFFICE_APP_GROUP"

    public static final String ADMIN_PERMISSION_PATTERN = "target:'*'"

    def grailsApplication
    def permissionService

    protected static final String APP_PERM_PREFIX = ""
    protected static final String DEFAULT_PERM = "default"

    def init() {

        // TODO: add try catches
        List<WibiRole> roles = [SupportRole, AdminRole, StandardRole, MerchantRole, BackOfficeRole, StoreAdminRole, StoreEmployeeRole, CustomerRole]
        for (_role in roles) {
            Role role = createRole(_role.ROLE_NAME, _role.ROLE_DESC)
            grantStandardPermissionsToRole(_role.getPermissions(), role)
        }
        // handle error
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


    def serviceMethod() {

    }
}
