package ChainOfResponsibility.base;

import ChainOfResponsibility.objects.Client;

public abstract class BaseHandler {
    private BaseHandler nextHandler = null;
    public Client handle(Client client) {
        if(nextHandler!= null) {
            this.nextHandler.handle(client);
        }
        return client;
    }
    public BaseHandler setNextHandler(BaseHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this.nextHandler;
    }
}
