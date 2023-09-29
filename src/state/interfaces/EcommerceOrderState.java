package state.interfaces;

public interface EcommerceOrderState {
    public String getName();
    public void riskAnalysis();
    public void processing();
    public void waitingPayment();
    public void paymentApproved();
    public void paymentRejected();
    public void sendGiftCard();
}
