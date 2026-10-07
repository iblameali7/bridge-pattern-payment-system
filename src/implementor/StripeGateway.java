package implementor;

public class StripeGateway implements PaymentGateway{
    @Override
    public void charge(double amount){
        System.out.println("Stripe: charged "+ amount+ " USD");
    }
    @Override
    public String getProviderName(){
        return "Stripe";
    }

}
