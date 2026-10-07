package abstraction;
import implementor.PaymentGateway;

public abstract class Payment {
    protected PaymentGateway gateway;

    public Payment(PaymentGateway gateway){
        this.gateway=gateway;
    }

    public void setGateway(PaymentGateway gateway){
        this.gateway=gateway;
    }

    public abstract void pay(double amount);
}
