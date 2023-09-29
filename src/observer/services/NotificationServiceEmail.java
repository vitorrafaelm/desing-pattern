package observer.services;

import observer.interfaces.EventListener;
import observer.services.interfaces.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class NotificationServiceEmail implements NotificationService {
    private final List<EventListener> customers;

    public NotificationServiceEmail() {
        customers = new ArrayList<>();
    }

    public void subscribe(EventListener listener) {
        customers.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        for (int x = 0; x < customers.size(); x++) {
            if (customers.get(x).getSender().contains(listener.getSender())){
                customers.remove(customers.get(x));
            }
        }
    }

    public void notifyCustomers(String extraInformation) {
        customers.forEach(listener -> listener.update(extraInformation));
    }
}
