package ChainOfResponsibility;

import ChainOfResponsibility.base.BaseHandler;
import ChainOfResponsibility.handles.HandleOrder;
import ChainOfResponsibility.handles.HandleOrderByManualProbation;
import ChainOfResponsibility.handles.ManagerHandleOrder;
import ChainOfResponsibility.objects.Client;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        client.setLimit(1200.00F);
        client.setName("Victor");
        client.setValue(65000F);

        BaseHandler orderHandler = new HandleOrder();

        orderHandler
                .setNextHandler(new ManagerHandleOrder())
                .setNextHandler(new HandleOrderByManualProbation());

        orderHandler.handle(client);
    }
}
