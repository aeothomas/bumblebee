package commerce.acl
/**
 * Created by @author: Abidemi O-Thomas on 17/01/2014.
 */
class AdminRole extends WibiRole {

    public static final String ROLE_NAME = "ADMIN"
    public static final String ROLE_DESC = "Admin role is intended for administrators of the admin team"

    private static final List<ApplicationPermissions> BACK_OFFICE_PERMS = [
    ]

    private static final List<ApplicationPermissions> REGISTER_PERMS = [
    ]

    @Override
    public static List<ApplicationPermissions> getPermissions() {
        return [BACK_OFFICE_PERMS, REGISTER_PERMS].flatten()
    }

}
