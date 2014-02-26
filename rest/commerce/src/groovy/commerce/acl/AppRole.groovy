package commerce.acl
/**
 * Created by @author: Abidemi O-Thomas on 17/01/2014.
 */
class AppRole extends WibiRole {

    public static final String ROLE_NAME = "APP"
    public static final String ROLE_DESC = "APP role is intended for system App to perform certain actions"

    private static final List<ApplicationPermissions> BACK_OFFICE_PERMS = [
            BackOfficePermissions.ACCOUNT_READ_ALL_PERM.permission(),
            BackOfficePermissions.ACCOUNT_CREATE_ALL_PERM.permission(),
            BackOfficePermissions.ACCOUNT_UPDATE_ALL_PERM.permission(),
            BackOfficePermissions.ACCOUNT_DELETE_ALL_PERM.permission()
    ]

    private static final List<ApplicationPermissions> REGISTER_PERMS = [
            RegisterPermissions.SETTINGS_READ_ALL_PERM.permission()
    ]

    @Override
    public static List<ApplicationPermissions> getPermissions() {
        return [BACK_OFFICE_PERMS, REGISTER_PERMS].flatten()
    }

}
