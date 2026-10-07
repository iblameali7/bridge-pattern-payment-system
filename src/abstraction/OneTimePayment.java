package abstraction;

import implementor.PaymentGateway;

public class OneTimePayment extends Payment {

    public OneTimePayment(PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    public void pay(double amount) {
        System.out.println("One-time payment via " + gateway.getProviderName());
        gateway.charge(amount);
    }
}