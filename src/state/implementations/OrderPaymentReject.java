package state.implementations;

import state.context.EcommerceOrder;
import state.interfaces.EcommerceOrderState;

public class OrderPaymentReject implements EcommerceOrderState {
    private String name = "PaymentRejected";
    private final EcommerceOrder ecommerceOrder;

    public OrderPaymentReject(EcommerceOrder ecommerceOrder) {
        this.ecommerceOrder = ecommerceOrder;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void riskAnalysis() {
        this.ecommerceOrder.setState(new OrderRiskAnalysis(this.ecommerceOrder));
    }

    @Override
    public void processing() {
        this.ecommerceOrder.setState(new OrderProcessing(this.ecommerceOrder));
    }

    @Override
    public void waitingPayment() {
        this.ecommerceOrder.setState(new OrderWaitingPayment(this.ecommerceOrder));
    }

    @Override
    public void paymentApproved() {
        this.ecommerceOrder.setState(new OrderPaymentApproved(this.ecommerceOrder));
    }

    @Override
    public void paymentRejected() {
        System.out.println("Order is already rejected");
    }

    @Override
    public void sendGiftCard() {
        System.out.println("The payment is rejected and It is not possible to send giftcard");
    }
}
