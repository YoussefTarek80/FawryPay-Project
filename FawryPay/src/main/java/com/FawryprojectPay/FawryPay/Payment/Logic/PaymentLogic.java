package com.FawryprojectPay.FawryPay.Payment.Logic;
import com.FawryprojectPay.FawryPay.DB.Logic.Database;
import com.FawryprojectPay.FawryPay.DB.Model.Customer;
import com.FawryprojectPay.FawryPay.Payment.Model.Payment;
import org.springframework.stereotype.Service;
@Service
public class PaymentLogic {
    Payment Payment;
    public Database DB;
    PaymentLogic(){}
    public String Pay(Customer user,String serviceName ,String provider ,double amount ,int pass ){
        return "";
    }

    public String SetCreditCardInfo(Payment CreditCard){
        Payment.CreditCardBalance=CreditCard.CreditCardBalance;
        return "Credit Balance IN...";
    }
    public String AddFunds(Customer User,double Amount){
        for (Customer user : DB.usersTable){
            if(user.getEmail().equals(User.getEmail())){
                SetFunds(Amount,user);
                return "Funds Added Success...";
            }
        }
        return "User NotFound!!";
    }
    public void SetFunds(double Funds,Customer User){
        User.setWalletBalance(User.getWalletBalance() + Funds);
    }
//    @Override
//    public boolean pay(double amount,double discount) {
//        amount -= (amount *(discount/100.0));
//        if(amount > this.BalanceWallet)
//            return false;
//        else{
//            double D = this.BalanceWallet - amount;
//            this.setBalanceWallet(D);
//            return true;
//        }
//    }
//    public boolean pay(double amount) {
//        if(amount > this.BalanceWallet)
//            return false;
//        else{
//            double D = this.BalanceWallet - amount;
//            this.setBalanceWallet(D);
//            return true;
//        }
//    }


//        public void SetFunds(double Funds){
//        double B = this.BalanceWallet;
//        B = B + Funds;
//        this.setBalanceWallet(B);
//    }
//    public String SetBalanceInWallet(Wallet wallet){
//        for (CreditCard creditCardDB:CreditCardsTABLE){
//            if(creditCardDB.getBalanceCreditCard()<wallet.getBalanceWallet()){
//                return "Credit Card Not Have Enough Money";
//            }
//        }
//        return "Successfully Added";
//    }
//    public String AddFunds(CreditCard creditCard) {
//        if(creditCard.getBalanceCreditCard() <creditCard.getFunds()){
//            return "Credit Card Not Have Enough Money ";
//        }
//        return "Added";
//    }
//    public String AddFunds(){
//        if(creditCard.getBalanceCreditCard() <creditCard.getFunds()){
//            return "Credit Card Not Have Enough Money ";
//        }
//        V.UserWallet.get(user.getEmail()).SetFunds(creditCard.getFunds());
//        return "Added";
//        return V.UserWallet.get(user.getEmail()).getBalanceWallet();
//    }


//    @Override
//    public boolean pay(double amount,double discount) {
//        amount -= (amount *(discount/100.0));
//        double B = creditCard.getBalanceCreditCard();
//        if(amount>B)
//            return false;
//        else{
//            creditCard.setBalanceCreditCard(B-amount);
//            return true;
//        }
//    }

//    public String pay(double amount) {
//        double B = creditCard.getBalanceCreditCard();
//        if(amount>B)
//            return "There are not Money";
//        else{
//            creditCard.setBalanceCreditCard(B-amount);
//            return "Success Pay";
//        }
//    }
}
