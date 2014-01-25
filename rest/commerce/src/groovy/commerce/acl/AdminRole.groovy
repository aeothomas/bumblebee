package commerce.acl
/**
 * Created by @author: Abidemi O-Thomas on 17/01/2014.
 */
class AdminRole extends WibiRole {

    public static final String ROLE_NAME = "ADMIN"
    public static final String ROLE_DESC = "Admin role is intended for administrators of the admin team"

    private static final List<ApplicationPermissions> BACK_OFFICE_PERMS = [
            BackOfficePermissions.REPORTING_READ_ALL_PERM.permission(),
            BackOfficePermissions.REPORTING_CREATE_ALL_PERM.permission(),
            BackOfficePermissions.REPORTING_UPDATE_ALL_PERM.permission(),
            BackOfficePermissions.REPORTING_DELETE_ALL_PERM.permission(),

            BackOfficePermissions.INVENTORY_READ_ALL_PERM.permission(),
            BackOfficePermissions.INVENTORY_CREATE_ALL_PERM.permission(),
            BackOfficePermissions.INVENTORY_UPDATE_ALL_PERM.permission(),
            BackOfficePermissions.INVENTORY_DELETE_ALL_PERM.permission(),

            BackOfficePermissions.TRANSACTION_READ_ALL_PERM.permission(),
            BackOfficePermissions.TRANSACTION_CREATE_ALL_PERM.permission(),
            BackOfficePermissions.TRANSACTION_UPDATE_ALL_PERM.permission(),
            BackOfficePermissions.TRANSACTION_DELETE_ALL_PERM.permission(),

            BackOfficePermissions.CUSTOMER_READ_ALL_PERM.permission(),
            BackOfficePermissions.CUSTOMER_CREATE_ALL_PERM.permission(),
            BackOfficePermissions.CUSTOMER_UPDATE_ALL_PERM.permission(),
            BackOfficePermissions.CUSTOMER_DELETE_ALL_PERM.permission(),

            BackOfficePermissions.ACCOUNT_READ_ALL_PERM.permission(),
            BackOfficePermissions.ACCOUNT_CREATE_ALL_PERM.permission(),
            BackOfficePermissions.ACCOUNT_UPDATE_ALL_PERM.permission(),
            BackOfficePermissions.ACCOUNT_DELETE_ALL_PERM.permission(),

            BackOfficePermissions.USERS_READ_ALL_PERM.permission(),
            BackOfficePermissions.USERS_CREATE_ALL_PERM.permission(),
            BackOfficePermissions.USERS_UPDATE_ALL_PERM.permission(),
            BackOfficePermissions.USERS_DELETE_ALL_PERM.permission(),

            BackOfficePermissions.REGISTERS_READ_ALL_PERM.permission(),
            BackOfficePermissions.REGISTERS_CREATE_ALL_PERM.permission(),
            BackOfficePermissions.REGISTERS_UPDATE_ALL_PERM.permission(),
            BackOfficePermissions.REGISTERS_DELETE_ALL_PERM.permission(),

            BackOfficePermissions.PROMOTION_READ_ALL_PERM.permission(),
            BackOfficePermissions.PROMOTION_CREATE_ALL_PERM.permission(),
            BackOfficePermissions.PROMOTION_UPDATE_ALL_PERM.permission(),
            BackOfficePermissions.PROMOTION_DELETE_ALL_PERM.permission()
    ]

    private static final List<ApplicationPermissions> REGISTER_PERMS = [

            RegisterPermissions.SETTINGS_READ_ALL_PERM.permission(),
            RegisterPermissions.SETTINGS_CREATE_ALL_PERM.permission(),
            RegisterPermissions.SETTINGS_UPDATE_ALL_PERM.permission(),

            RegisterPermissions.CUSTOMER_READ_ALL_PERM.permission(),
            RegisterPermissions.CUSTOMER_CREATE_ALL_PERM.permission(),
            RegisterPermissions.CUSTOMER_UPDATE_ALL_PERM.permission(),

            RegisterPermissions.EMPLOYEE_READ_ALL_PERM.permission(),

            RegisterPermissions.REGISTERS_OPEN_ALL_PERM.permission(),
            RegisterPermissions.REGISTERS_CLOSE_ALL_PERM.permission(),
            RegisterPermissions.REGISTERS_CHECKIN_ALL_PERM.permission(),
            RegisterPermissions.REGISTERS_CHECKOUT_ALL_PERM.permission(),

            RegisterPermissions.REPORTS_READ_ALL_PERM.permission(),
            RegisterPermissions.REPORTS_PRINT_ALL_PERM.permission()
    ]

    @Override
    public static List<ApplicationPermissions> getPermissions() {
        return [BACK_OFFICE_PERMS, REGISTER_PERMS].flatten()
    }

}
