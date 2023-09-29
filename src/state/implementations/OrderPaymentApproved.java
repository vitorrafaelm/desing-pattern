package state.implementations;

import state.context.EcommerceOrder;
import state.interfaces.EcommerceOrderState;

public class OrderPaymentApproved implements EcommerceOrderState {
    private final String name = "PaymentApproved";
    private final EcommerceOrder ecommerceOrder;

    public OrderPaymentApproved(EcommerceOrder ecommerceOrder) {
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
        System.out.println("Order is already approved");
    }

    @Override
    public void paymentApproved() {
        this.ecommerceOrder.setState(new OrderPaymentApproved(this.ecommerceOrder));
    }

    @Override
    public void paymentRejected() {
        System.out.println("The order payment is already approved please send the order");
    }

    @Override
    public void sendGiftCard() {
        System.out.println("Sending order to client");
    }
}
