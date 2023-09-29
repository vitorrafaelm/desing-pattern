package state.context;

import state.implementations.OrderProcessing;
import state.interfaces.EcommerceOrderState;

public class EcommerceOrder {
    EcommerceOrderState state;

    public EcommerceOrder() {
        this.state = new OrderProcessing(this);
    }

    public EcommerceOrderState getState() {
        return this.state;
    }

    public void setState(EcommerceOrderState state) {
        this.state = state;
        System.out.println("The order state is " + this.getStateName());
    }

    public String getStateName() {
        return this.state.getName();
    }

    public void orderPaymentRiskAnalysis() {
        this.state.riskAnalysis();
    }

    public void orderPaymentProcessing() {
        this.state.processing();
    }

    public void orderPaymentWaitingPayment() {
        this.state.waitingPayment();
    }

    public void orderPaymentApproved() {
        this.state.paymentApproved();
    }

    public void orderPaymentRejected() {
        this.state.paymentRejected();
    }

    public void sendGiftCard() {
        this.state.sendGiftCard();
    }
}
