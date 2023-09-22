package observer.context;

import observer.services.NotificationServiceEmail;
import observer.services.NotificationServicePhone;
import observer.services.interfaces.NotificationService;

public class Store {

    private NotificationService notificationService;

    public Store(String serviceType) {
        if (serviceType.contains("phone")) {
            notificationService = new NotificationServicePhone();
            return;
        }

        notificationService = new NotificationServiceEmail();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomers("Promotion");
    }

    public void salePromotion() {
        notificationService.notifyCustomers("Sale");
    }

    public NotificationService getService() {
        return notificationService;
    }

    public void changeService(String serviceType) {
        if (serviceType.contains("phone")) {
            this.notificationService = new NotificationServicePhone();
            return;
        }

        this.notificationService = new NotificationServiceEmail();
    }
}
