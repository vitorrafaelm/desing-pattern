package state;

import state.context.EcommerceOrder;

public class Main {

    public static void main(String[] args) {
        EcommerceOrder ecommerceOrder = new EcommerceOrder();

        ecommerceOrder.orderPaymentRiskAnalysis();
        ecommerceOrder.orderPaymentWaitingPayment();
        ecommerceOrder.orderPaymentApproved();


        ecommerceOrder.orderPaymentRejected();
        ecommerceOrder.sendGiftCard();
    }
}
