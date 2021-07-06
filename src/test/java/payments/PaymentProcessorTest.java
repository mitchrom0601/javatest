package payments;
import org.junit.Test;


public class PaymentProcessorTest {

    @Test
    public void payment_is_correct() {
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any)).thenReponse.PaymentStatus.OK));


        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        assertTrue(paymentProcessor.makePayment(1000));
    }

    }

    @Test
    public void payment_is_wrog() {
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any)).thenReponse.PaymentStatus.ERROR));


        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        assertTrue(paymentProcessor.makePayment(1000));
    }

}
}