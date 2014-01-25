package commerce.acl
/**
 * Created by @author: Abidemi O-Thomas on 17/01/2014.
 */
class CustomerRole extends WibiRole {

    public static final String ROLE_NAME = "CUSTOMER"
    public static final String ROLE_DESC = "Customer role is intended for customers of the system"

    private static final List<ApplicationPermissions> BACK_OFFICE_PERMS = [
    ]

    private static final List<ApplicationPermissions> REGISTER_PERMS = [
    ]

    @Override
    public static List<ApplicationPermissions> getPermissions() {
        return [BACK_OFFICE_PERMS, REGISTER_PERMS].flatten()
    }

}
