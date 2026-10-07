import abstraction.OneTimePayment;
import abstraction.Payment;
import abstraction.SubscriptionPayment;
import implementor.KaspiGateway;
import implementor.PayPalGateway;
import implementor.StripeGateway;

public class Main {
    public static void main(String[] args) {
        // 1. Разовый платёж через Stripe
        Payment payment = new OneTimePayment(new StripeGateway());
        payment.pay(100);

        System.out.println();

        // 2. Тот же объект, но меняем провайдера на лету
        payment.setGateway(new KaspiGateway());
        payment.pay(50000);

        System.out.println();

        // 3. Другой вид платежа с другим провайдером
        Payment subscription = new SubscriptionPayment(new PayPalGateway(), 3);
        subscription.pay(10);
    }
}