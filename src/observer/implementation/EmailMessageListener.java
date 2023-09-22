package observer.implementation;

import observer.interfaces.EventListener;

public class EmailMessageListener implements EventListener {
    private final String email;

    public EmailMessageListener(String email) {
        this.email = email;
    }

    public String getSender() {
        return email;
    }

    @Override
    public void update(String extraInformation) {
        System.out.println("Sending mail to " + email + " due to " + extraInformation);
    }
}
