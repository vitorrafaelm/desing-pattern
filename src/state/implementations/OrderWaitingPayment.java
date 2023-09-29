package state.implementations;

import state.context.EcommerceOrder;
import state.interfaces.EcommerceOrderState;

public class OrderWaitingPayment implements EcommerceOrderState {
    private String name = "OrderWaitingPayment";
    private final EcommerceOrder ecommerceOrder;

    public OrderWaitingPayment(EcommerceOrder ecommerceOrder) {
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
        System.out.println("Order is already waiting for payment");
    }

    @Override
    public void paymentApproved() {
        this.ecommerceOrder.setState(new OrderPaymentApproved(this.ecommerceOrder));
    }

    @Override
    public void paymentRejected() {
        this.ecommerceOrder.setState(new OrderPaymentReject(this.ecommerceOrder));

    }

    @Override
    public void sendGiftCard() {
        System.out.println("Order is waiting payment");
    }
}
