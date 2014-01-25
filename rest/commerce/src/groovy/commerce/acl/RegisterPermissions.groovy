package commerce.acl

/**
 * Created by @author: Abidemi O-Thomas on 17/01/2014.
 */
enum RegisterPermissions implements ApplicationPermissions {

    SETTINGS_READ_ALL_PERM("settings:read:*"),
    SETTINGS_CREATE_ALL_PERM("settings:create:*"),
    SETTINGS_UPDATE_ALL_PERM("settings:update:*"),

    CUSTOMER_READ_ALL_PERM("customer:read:*"),
    CUSTOMER_CREATE_ALL_PERM("customer:create:*"),
    CUSTOMER_UPDATE_ALL_PERM("customer:update:*"),
    CUSTOMER_DELETE_ALL_PERM("customer:delete:*"),

    EMPLOYEE_READ_ALL_PERM("employee:read:*"),

    REGISTERS_OPEN_ALL_PERM("registers:open:*"),
    REGISTERS_CLOSE_ALL_PERM("registers:close:*"),
    REGISTERS_CHECKIN_ALL_PERM("registers:checkin:*"),
    REGISTERS_CHECKOUT_ALL_PERM("registers:checkout:*"),

    REPORTS_READ_ALL_PERM("reports:read:*"),
    REPORTS_PRINT_ALL_PERM("reports:print:*"),
    REPORTS_DELETE_ALL_PERM("reports:delete:*")

    private final String permission
    protected static final String APP_PERM_PREFIX = "register"

    RegisterPermissions(String permission) {
        this.permission = APP_PERM_PREFIX + (permission ?: DEFAULT_PERM)
    }

    public String permission() { return permission }

}