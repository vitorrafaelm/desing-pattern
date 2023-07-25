package ChainOfResponsibility.handles;

import ChainOfResponsibility.base.BaseHandler;
import ChainOfResponsibility.objects.Client;

public class HandleOrder extends BaseHandler {
    public Client handle(Client client) {
        if(client.getLimit() >= client.getValue()) {
            System.out.println("The platform has approved");
            client.setLimit(client.getLimit() - client.getValue());
            return client;
        }

        return super.handle(client);
    }
}
