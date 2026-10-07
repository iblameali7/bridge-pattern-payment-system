package implementor;

public class KaspiGateway implements PaymentGateway{
    @Override
    public void charge(double amount){
        System.out.println("Kaspi: charged "+ amount+ " USD");
    }
    @Override
    public String getProviderName(){
        return "Kaspi";
    }
}
