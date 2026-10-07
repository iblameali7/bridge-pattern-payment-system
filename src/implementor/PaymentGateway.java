package implementor;

public interface PaymentGateway {
    public void charge(double amount);
    public String getProviderName();
}
