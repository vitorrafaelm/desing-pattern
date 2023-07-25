package ChainOfResponsibility.handles;

import ChainOfResponsibility.base.BaseHandler;
import ChainOfResponsibility.objects.Client;

public class ManagerHandleOrder extends BaseHandler {
    public Client handle(Client client) {

        Float negativeCredit = client.getLimit() - client.getValue();
        if((negativeCredit * -1) < 5000) {
            System.out.println("The manager has approved");
            client.setLimit(client.getLimit() - client.getValue());
            return client;
        }

        return super.handle(client);
    }
}
