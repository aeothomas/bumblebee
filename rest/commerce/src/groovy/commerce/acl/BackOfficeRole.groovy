package commerce.acl
/**
 * Created by @author: Abidemi O-Thomas on 17/01/2014.
 */
class BackOfficeRole extends WibiRole {

    public static final String ROLE_NAME = "BACKOFFICE"
    public static final String ROLE_DESC = "Back-Office role is intended for the merchant's back office staff"

    private static final List<ApplicationPermissions> BACK_OFFICE_PERMS = [
            BackOfficePermissions.REPORTING_READ_ALL_PERM.permission(),

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
    ]

    @Override
    public static List<ApplicationPermissions> getPermissions() {
        return [BACK_OFFICE_PERMS, REGISTER_PERMS].flatten()
    }

}
