package com.FawryprojectPay.FawryPay.Logic;
import com.FawryprojectPay.FawryPay.Models.*;
import com.FawryprojectPay.FawryPay.Models.Payment.Payment;
import com.FawryprojectPay.FawryPay.Models.Services.Donations;
import com.FawryprojectPay.FawryPay.Models.Services.LandlineServices;
import com.FawryprojectPay.FawryPay.Models.Users.Admin;
import com.FawryprojectPay.FawryPay.Models.Users.Customer;
import org.springframework.stereotype.Service;
@Service
public class PaymentLogic {
    public Payment payment;
    public UserLogic DB;
    public Admin admin;
    public Transaction transaction;
    public ProviderLogic providerLogic=new ProviderLogic();
    public Donations donations=new Donations();
    public LandlineServices lls=new LandlineServices();
    PaymentLogic(){}
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
                    payment = new Payment(Amount,user.getEmail(),"Recharge Wallet");
                    user.AddTransaction(payment);
                    admin.AllWalletTransactions.add(payment);
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
                    transaction=new Transaction(Donation,"DonationByWallet For : "+
                            donations.DonationsHS.get(Code),customer.getTransactionArr().size(),customer.getEmail());
                    customer.AddTransaction(transaction);
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
                    transaction=new Transaction(Donation,"DonationByCreditCard For : "+
                            donations.DonationsHS.get(Code),customer.getTransactionArr().size(),customer.getEmail());
                    customer.AddTransaction(transaction);
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
    public String DonateByCash(String Email,double Donation,String Code) {//credit card
        for (Customer customer:DB.usersTable) {
            if(customer.getEmail().equals(Email)){
                if(donations.DonationsHS.containsKey(Code))
                    return "Donation [Cash Paid] "+donations.DonationsHS.get(Code);
                else return "Donation Code is Wrong...";
            }
        }
        return "User Not Found ...";
    }
    public String RechargeMonthlyReceiptByWallet(String Email) {//Discount don't forget that
        for (Customer customer:DB.usersTable) {
            if(customer.getEmail().equals(Email)){
                if(customer.getWalletBalance()>=lls.MonthlyAmount){
                    customer.setWalletBalance(customer.getWalletBalance()-lls.MonthlyAmount);
                    transaction=new Transaction(lls.MonthlyAmount,"Monthly Receipt By Wallet",
                            customer.getTransactionArr().size(),customer.getEmail());
                    customer.AddTransaction(transaction);
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
                    transaction=new Transaction(lls.QuarterAmount,"Quarter Receipt By Wallet",
                            customer.getTransactionArr().size(),customer.getEmail());
                    customer.AddTransaction(transaction);
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
                    transaction=new Transaction(lls.MonthlyAmount,"Monthly Receipt By Credit Card",
                            customer.getTransactionArr().size(),customer.getEmail());
                    customer.AddTransaction(transaction);
                    return "Receipt Paid Successfully";
                }
                else return "Your Wallet hasn't enough Money";
            }
        }
        return "User Not Found ...";
    }
    public String RechargeQuarterReceiptByCreditCard(String Email) {//Discount don't forget that
        for (Customer customer:DB.usersTable) {
            if(customer.getEmail().equals(Email)){
                if(customer.getCreditBalance()>=lls.QuarterAmount){
                    customer.setCreditBalance(customer.getCreditBalance()-lls.QuarterAmount);
                    transaction=new Transaction(lls.QuarterAmount,"Quarter Receipt By Credit Card",
                            customer.getTransactionArr().size(),customer.getEmail());
                    customer.AddTransaction(transaction);
                    return "Receipt Paid Successfully";
                }
                else{
                    return "Your Wallet hasn't enough Money";
                }
            }
        }
        return "User Not Found ...";
    }
    public String RechargeMonthlyReceiptByCash(String Email) {
        for (Customer customer:DB.usersTable) {
            if(customer.getEmail().equals(Email)) return "Service Paid [CASH]...";
        }
        return "User Not Found ...";
    }
    public String RechargeQuarterReceiptByCash(String Email) {
        for (Customer customer:DB.usersTable) {
            if(customer.getEmail().equals(Email)) return "Service Paid [CASH]...";
        }
        return "User Not Found ...";
    }
    public String MobileRechargeServices(String Number,String Email,String Provider,
                                         double Amount,String PayMethod) {//Discount don't forget that
        return providerLogic.providerMobile(Number,Email,Provider,Amount,PayMethod);
    }
    public String InternetRechargeServices(String Number,String Email,String Provider,
                                           double Amount,String PayMethod) {//Discount don't forget that
        return providerLogic.providerInternet(Number,Email,Provider,Amount,PayMethod);
    }
}
