package implementor;

public class PayPalGateway implements PaymentGateway{
    @Override
    public void charge(double amount){
        System.out.println("PayPal : charged "+ amount+ " USD");
    }
    @Override
    public String getProviderName(){
        return "PayPal";
    }
}
