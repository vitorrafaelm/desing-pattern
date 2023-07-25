package ChainOfResponsibility.handles;

import ChainOfResponsibility.base.BaseHandler;
import ChainOfResponsibility.objects.Client;

public class HandleOrderByManualProbation extends BaseHandler {
    public Client handle(Client client) {
        System.out.println("This order needs to be approved by someone");
        return client;
    }
}
