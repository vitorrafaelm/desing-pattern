package state.implementations;

import state.context.EcommerceOrder;
import state.interfaces.EcommerceOrderState;

public class OrderProcessing implements EcommerceOrderState {
    private String name = "OrderProcessing";

    private final EcommerceOrder ecommerceOrder;

    public OrderProcessing(EcommerceOrder ecommerceOrder) {
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
        System.out.println("Order is already processing");
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
        System.out.println("Order is still processing");
    }
}
