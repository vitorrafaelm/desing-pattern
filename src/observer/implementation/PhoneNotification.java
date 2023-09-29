package observer.implementation;

import observer.interfaces.EventListener;

public class PhoneNotification implements EventListener {
    private final String phoneNumber;
    public PhoneNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getSender() {
        return this.phoneNumber;
    }

    @Override
    public void update(String extraInformation) {
        System.out.println("Sending phone message to " + phoneNumber + " due to " + extraInformation);
    }
}
