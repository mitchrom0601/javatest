package payments;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway){
        this.paymentGateway=paymentGateway;
    }



    public boolean mokePayment(double amount) {
        PaymentResponse reponse = paymentGateway.requestPayment(new PaymentRequest(amount));
        if (reponse.getStatus() == PaymentResponse.PaymentStatus.Ok) {
            return true;

        } else {
            return false;
        }
    }

    }
}
