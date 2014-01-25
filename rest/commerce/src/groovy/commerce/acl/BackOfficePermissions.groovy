package commerce.acl

/**
 * Created by @author: Abidemi O-Thomas on 17/01/2014.
 */
enum BackOfficePermissions implements ApplicationPermissions {

    REPORTING_READ_ALL_PERM("reporting:read:*"),
    REPORTING_CREATE_ALL_PERM("reporting:create:*"),
    REPORTING_UPDATE_ALL_PERM("reporting:update:*"),
    REPORTING_DELETE_ALL_PERM("reporting:delete:*"),

    INVENTORY_READ_ALL_PERM("inventory:read:*"),
    INVENTORY_CREATE_ALL_PERM("inventory:create:*"),
    INVENTORY_UPDATE_ALL_PERM("inventory:update:*"),
    INVENTORY_DELETE_ALL_PERM("inventory:delete:*"),

    TRANSACTION_READ_ALL_PERM("transaction:read:*"),
    TRANSACTION_CREATE_ALL_PERM("transaction:create:*"),
    TRANSACTION_UPDATE_ALL_PERM("transaction:update:*"),
    TRANSACTION_DELETE_ALL_PERM("transaction:delete:*"),

    CUSTOMER_READ_ALL_PERM("customer:read:*"),
    CUSTOMER_CREATE_ALL_PERM("customer:create:*"),
    CUSTOMER_UPDATE_ALL_PERM("customer:update:*"),
    CUSTOMER_DELETE_ALL_PERM("customer:delete:*"),

    ACCOUNT_READ_ALL_PERM("account:read:*"),
    ACCOUNT_CREATE_ALL_PERM("account:create:*"),
    ACCOUNT_UPDATE_ALL_PERM("account:update:*"),
    ACCOUNT_DELETE_ALL_PERM("account:delete:*"),

    USERS_READ_ALL_PERM("users:read:*"),
    USERS_CREATE_ALL_PERM("users:create:*"),
    USERS_UPDATE_ALL_PERM("users:update:*"),
    USERS_DELETE_ALL_PERM("users:delete:*"),

    REGISTERS_READ_ALL_PERM("registers:read:*"),
    REGISTERS_CREATE_ALL_PERM("registers:create:*"),
    REGISTERS_UPDATE_ALL_PERM("registers:update:*"),
    REGISTERS_DELETE_ALL_PERM("registers:delete:*"),

    PROMOTION_READ_ALL_PERM("promotion:read:*"),
    PROMOTION_CREATE_ALL_PERM("promotion:create:*"),
    PROMOTION_UPDATE_ALL_PERM("promotion:update:*"),
    PROMOTION_DELETE_ALL_PERM("promotion:delete:*")

    private final String permission
    private static final String APP_PERM_PREFIX = "backoffice"
    private static final String DEFAULT_PERM = "default"

    BackOfficePermissions(String permission) {
        this.permission = APP_PERM_PREFIX + (permission ?: DEFAULT_PERM)
    }

    public String permission() { return permission }

}