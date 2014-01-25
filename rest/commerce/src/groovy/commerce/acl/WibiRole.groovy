package commerce.acl

import grails.plugin.nimble.core.Role

/**
 * Created by @author: Abidemi O-Thomas on 17/01/2014.
 */
abstract class WibiRole {

    public static final String ROLE_NAME = "DEFAULT NAME"
    public static final String ROLE_DESC = "DEFAULT DESC"

    /*
        An abstract method that will be used by each Role implementing class to initialise itself.
     */
    abstract public static List<ApplicationPermissions> getPermissions();

}
