package commerce.acl

import grails.plugin.nimble.core.Permission
import grails.plugin.nimble.core.Role

/**
 * Created by @author: Abidemi O-Thomas on 17/01/2014.
 */
class WibiPermission {

    protected static final String APP_PERM_PREFIX = ""
    protected static final String DEFAULT_PERM = "default"

    def permissionService

    def boolean grantPermissionToRole(String permission, Role role, boolean isAdmin) {

        permissionService.createPermission( generatePermission(getPermissionNameFromApp(permission), isAdmin), role )

        // handle error
    }

    def boolean grantStandardPermissionsToRole(List<ApplicationPermissions> perms, Role role) {

        if (perms) {
            for (perm in perms) {
                grantPermissionToRole(perm, role, false)
            }
        }

    }

    protected def String getPermissionNameFromApp(String permission) {

        return APP_PERM_PREFIX + (permission ?: DEFAULT_PERM)

    }

    protected def Permission generatePermission(String permission, boolean isAdmin) {

        if (permission) {

            Permission _permission = new Permission(isAdmin ? ADMIN_PERMISSION_PATTERN : permission) //target:'*')
            _permission.managed = true
            _permission.type = isAdmin ? Permission.adminPerm : Permission.wildcardPerm
            return _permission

        } else {
            throw new RuntimeException("Unable to create valid permission as permission is likely to have been null")
        }

    }
}
