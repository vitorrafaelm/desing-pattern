package state.implementations;

import state.context.EcommerceOrder;
import state.interfaces.EcommerceOrderState;

public class OrderRiskAnalysis implements EcommerceOrderState {
    private String name = "OrderRiskAnalysis";

    private final EcommerceOrder ecommerceOrder;

    public OrderRiskAnalysis(EcommerceOrder ecommerceOrder) {
        this.ecommerceOrder = ecommerceOrder;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void riskAnalysis() {
        System.out.println("Order is already on risk analysis state");
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
        this.ecommerceOrder.setState(new OrderPaymentReject(this.ecommerceOrder));

    }

    @Override
    public void sendGiftCard() {
        System.out.println("Order is on risk analysis");
    }
}
