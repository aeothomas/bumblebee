package commerce

//import grails.transaction.Transactional
import org.springframework.context.ApplicationEvent
import org.springframework.context.ApplicationListener
import org.grails.datastore.mapping.query.event.PreQueryEvent
import org.grails.datastore.mapping.query.event.PostQueryEvent

//@Transactional
class MultiTenantService implements ApplicationListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    @Override
    void onApplicationEvent(ApplicationEvent event) {


        switch (event) {
            case {it instanceof PreQueryEvent} :
                handlePreQueryEvent(event);
                break;
            case {it instanceof PostQueryEvent} :
                handlePostQueryEvent(event);
                break;
            default:
                break;
        }

    }

    private void handlePreQueryEvent(PreQueryEvent pqe) {
        // TODO inject the merchant object or tenantId into query
    }

    private void handlePostQueryEvent(PostQueryEvent pqe) {
        // for now do nothing
    }

}
