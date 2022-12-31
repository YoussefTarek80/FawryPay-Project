package Payment;
import DB.Logic.Verifiable;
import User.USER;

public class CreditCard implements Payment{
    String CardName;
    String ExpirationDate;
    String CreditCardNumber;
    private double BalanceCreditCard;
    public void setCardName(String CardName){
        this.CardName=CardName;
    }
    public void setExpirationDate(String ExpirationDate){
        this.ExpirationDate=ExpirationDate;
    }
    public void setCreditCardNumber(String CreditCardNumber){
        this.CreditCardNumber=CreditCardNumber;
    }

    public String getCardName(){
        return CardName;
    }
    public String getExpirationDate(){
        return ExpirationDate;
    }
    public String getCreditCardNumber(){
        return CreditCardNumber;
    }
//    public double AddFunds(double funds,Verifiable V,USER user,CreditCard credit){
    public double AddFunds(double funds,Verifiable V,USER user){
//        if(V.UserWallet.get(user.getEmail()).getBalanceWallet()>Funds){}
        if(this.BalanceCreditCard<funds){
            System.out.println("Credit Card Not Have Enough Money ");
            return 0.0;
        }
        V.UserWallet.get(user.getEmail()).SetFunds(funds);
        return V.UserWallet.get(user.getEmail()).getBalanceWallet();
    }
    public void setBalanceCreditCard(double BalanceCreditCard){
        this.BalanceCreditCard=BalanceCreditCard;
    }
    public double getBalanceCreditCard(){
        return BalanceCreditCard;
    }
    @Override
    public boolean pay(double amount,double discount) {
        amount -= (amount *(discount/100.0));
        double B = getBalanceCreditCard();
        if(amount>B)
            return false;
        else{
            setBalanceCreditCard(B-amount);
            return true;
        }
    }
    public boolean pay(double amount) {
        double B = getBalanceCreditCard();
        if(amount>B)
            return false;
        else{
            setBalanceCreditCard(B-amount);
            return true;
        }
    }

    @Override
    public String toString() {
        return "[CardName" + CardName + ", CreditCardNumber=" + CreditCardNumber + ", ExpirationDate=" + ExpirationDate + "]";
    }


}
