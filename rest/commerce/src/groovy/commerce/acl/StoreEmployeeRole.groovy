package commerce.acl
/**
 * Created by @author: Abidemi O-Thomas on 17/01/2014.
 */
class StoreEmployeeRole extends WibiRole {

    public static final String ROLE_NAME = "STOREEMPLOYEE"
    public static final String ROLE_DESC = "Store employee role is intended for the merchant's store employees"

    private static final List<ApplicationPermissions> BACK_OFFICE_PERMS = [
    ]

    private static final List<ApplicationPermissions> REGISTER_PERMS = [

            RegisterPermissions.SETTINGS_READ_ALL_PERM.permission(),
            RegisterPermissions.SETTINGS_CREATE_ALL_PERM.permission(),
            RegisterPermissions.SETTINGS_UPDATE_ALL_PERM.permission(),

            RegisterPermissions.CUSTOMER_READ_ALL_PERM.permission(),
            RegisterPermissions.CUSTOMER_CREATE_ALL_PERM.permission(),
            RegisterPermissions.CUSTOMER_UPDATE_ALL_PERM.permission(),

            RegisterPermissions.EMPLOYEE_READ_ALL_PERM.permission(),

            RegisterPermissions.REGISTERS_CHECKIN_ALL_PERM.permission(),
            RegisterPermissions.REGISTERS_CHECKOUT_ALL_PERM.permission()
    ]

    @Override
    public static List<ApplicationPermissions> getPermissions() {
        return [BACK_OFFICE_PERMS, REGISTER_PERMS].flatten()
    }

}
