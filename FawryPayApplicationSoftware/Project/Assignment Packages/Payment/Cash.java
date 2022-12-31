package Payment;

public class Cash implements Payment{
    private boolean cashON;

    public void setCashON(boolean cashON){
        this.cashON=cashON;
    }
    public boolean getCashON(){
        return cashON;
    }
    @Override
    public boolean pay(double amount,double discount) {
       if(cashON){
           return true;
       }
       else{
           return false;
       }
    }
}
