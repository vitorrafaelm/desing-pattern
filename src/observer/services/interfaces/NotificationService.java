package observer.services.interfaces;

import observer.interfaces.EventListener;

public interface NotificationService {
    public void subscribe(EventListener listener);

    public void unsubscribe(EventListener listener);

    public void notifyCustomers(String extraInformation);
}
