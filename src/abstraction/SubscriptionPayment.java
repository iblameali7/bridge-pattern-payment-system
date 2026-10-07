package abstraction;

import implementor.PaymentGateway;

public class SubscriptionPayment extends Payment {
    private int months;

    public SubscriptionPayment(PaymentGateway gateway, int months) {
        super(gateway);
        this.months = months;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Subscription for " + months + " months via " + gateway.getProviderName());
        for (int i = 1; i <= months; i++) {
            System.out.println("Month " + i + ":");
            gateway.charge(amount);
        }
    }
}