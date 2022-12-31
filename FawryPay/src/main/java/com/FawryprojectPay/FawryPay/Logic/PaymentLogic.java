package com.FawryprojectPay.FawryPay.Logic;
import com.FawryprojectPay.FawryPay.Models.Customer;
import com.FawryprojectPay.FawryPay.Models.Donations;
import com.FawryprojectPay.FawryPay.Models.LandlineServices;
import com.FawryprojectPay.FawryPay.Models.Payment;
import org.springframework.stereotype.Service;
@Service
public class PaymentLogic {
    public Payment payment;
    public UserLogic DB;
    public Donations donations=new Donations();
    public LandlineServices lls=new LandlineServices();
    PaymentLogic(){}
    public String PayCreditCard(Customer user,String serviceName ,String provider ,double amount){//object payment
        return "";
    }
    public String PayByWallet(Customer user,String serviceName ,String provider ,double amount){//object Customer
        return "";
    }

    public String SetCreditCardBalance(double creditcardbalance,String Email){
        for (Customer user : DB.usersTable){
            if(user.getEmail().equals(Email)){
                user.setCreditBalance(creditcardbalance);
                return "CreditCardBalance Added Success...";
            }
        }
        return "User Not Found ...";
    }
    public String AddFunds(String Email,double Amount){
        for (Customer user : DB.usersTable){
            if(user.getEmail().equals(Email)){
                if(user.getCreditBalance()<Amount){
                    return "Your CreditCardBalance hasn't enough money";
                }
                else{
                    user.setCreditBalance(user.getCreditBalance()-Amount);
                    SetFunds(Amount,user);
                    return "Funds Added Success...";
                }
            }
        }
        return "User Not Found ...";
    }
    public void SetFunds(double Funds, Customer User){
        User.setWalletBalance(User.getWalletBalance() + Funds);
    }


    public String DonateByWallet(String Email, double Donation,String Code) {//wallet
        for (Customer customer : DB.usersTable) {
            if (customer.getEmail().equals(Email)) {
                if (customer.getWalletBalance() >= Donation&&donations.DonationsHS.containsKey(Code)) {
                    customer.setWalletBalance(customer.getWalletBalance() - Donation);
                    return "Donation Successfully "+donations.DonationsHS.get(Code);
                }
                else if(customer.getWalletBalance() >= Donation&&!donations.DonationsHS.containsKey(Code)){
                    return "Donation Code is Wrong...";
                }
                else {
                    return "Your Wallet hasn't enough Money";
                }
            }
        }
        return "User Not Found ...";
    }
    public String DonateByCreditCard(String Email,double Donation,String Code) {//credit card
        for (Customer customer:DB.usersTable) {
            if(customer.getEmail().equals(Email)){
                if(customer.getCreditBalance()>= Donation&&donations.DonationsHS.containsKey(Code)){
                    customer.setCreditBalance(customer.getCreditBalance() - Donation);
                    return "Donation Successfully "+donations.DonationsHS.get(Code);

                }
                else if(customer.getCreditBalance() >= Donation&&!donations.DonationsHS.containsKey(Code)){
                    return "Donation Code is Wrong...";
                }
                else{
                    return "Your CreditCard hasn't enough Money";
                }
            }
        }
        return "User Not Found ...";
    }
    public String RechargeMonthlyReceiptByWallet(String Email) {//Discount don't forget that
        for (Customer customer:DB.usersTable) {
            if(customer.getEmail().equals(Email)){
                if(customer.getWalletBalance()>=lls.MonthlyAmount){
                    customer.setWalletBalance(customer.getWalletBalance()-lls.MonthlyAmount);
                    return "Receipt Paid Successfully";
                }
                else{
                    return "Your Wallet hasn't enough Money";
                }
            }

        }
        return "User Not Found ...";
    }
    public String RechargeQuarterReceiptByWallet(String Email) {//Discount don't forget that
        for (Customer customer:DB.usersTable) {
            if(customer.getEmail().equals(Email)){
                if(customer.getWalletBalance()>=lls.QuarterAmount){
                    customer.setWalletBalance(customer.getWalletBalance()-lls.QuarterAmount);
                    return "Receipt Paid Successfully";
                }
                else{
                    return "Your Wallet hasn't enough Money";
                }
            }

        }
        return "User Not Found ...";
    }
    public String RechargeMonthlyReceiptByCreditCard(String Email) {//Discount don't forget that
        for (Customer customer:DB.usersTable) {
            if(customer.getEmail().equals(Email)){
                if(customer.getCreditBalance()>=lls.MonthlyAmount){
                    customer.setCreditBalance(customer.getCreditBalance()-lls.MonthlyAmount);
                    return "Receipt Paid Successfully";
                }
                else{
                    return "Your Wallet hasn't enough Money";
                }
            }

        }
        return "User Not Found ...";
    }
    public String RechargeQuarterReceiptByCreditCard(String Email) {//Discount don't forget that
        for (Customer customer:DB.usersTable) {
            if(customer.getEmail().equals(Email)){
                if(customer.getCreditBalance()>=lls.QuarterAmount){
                    customer.setCreditBalance(customer.getCreditBalance()-lls.QuarterAmount);
                    return "Receipt Paid Successfully";
                }
                else{
                    return "Your Wallet hasn't enough Money";
                }
            }

        }
        return "User Not Found ...";
    }


    //    public void SetFunds(double Funds){
//        double B = this.BalanceWallet;
//        B = B + Funds;
//        this.setBalanceWallet(B);
//    }
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
