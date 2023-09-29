package observer;

import observer.context.Store;
import observer.implementation.EmailMessageListener;
import observer.implementation.PhoneNotification;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("email");
        store.getService().subscribe(new EmailMessageListener("vitor.rafael1518@gmail.com"));
        store.getService().subscribe(new EmailMessageListener("matheus.mm@gmail.com"));
        store.getService().subscribe(new EmailMessageListener("email_vitor@gmail.com"));
        store.getService().subscribe(new EmailMessageListener("email_teste@gmail.com"));

        System.out.println("Notify all E-mails that were subscribed --------------------- \n");
        store.newItemPromotion();

        System.out.println("\nRemove one E-mail and notify the remaining ones --------------------- \n");
        store.getService().unsubscribe(new EmailMessageListener("email_vitor@gmail.com"));
        store.salePromotion();
        System.out.println("\n");

        store.changeService("phone");
        store.getService().subscribe(new PhoneNotification("(97) 97446-4747"));
        store.getService().subscribe(new PhoneNotification("(86) 99987-2070"));
        store.getService().subscribe(new PhoneNotification("(96) 97253-2732"));
        store.getService().subscribe(new PhoneNotification("(63) 98619-2085"));

        System.out.println("Notify all phones that were subscribed --------------------- \n");
        store.newItemPromotion();

        System.out.println("\nRemove one phones and notify the remaining ones --------------------- \n");
        store.getService().unsubscribe(new EmailMessageListener("(63) 98619-2085"));
        store.salePromotion();
    }
}
