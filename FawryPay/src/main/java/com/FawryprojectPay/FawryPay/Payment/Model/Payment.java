package com.FawryprojectPay.FawryPay.Payment.Model;

import com.FawryprojectPay.FawryPay.DB.Model.Customer;

public class Payment {
//    public Services obj=new Services();
//    public Customer User ;
    public double CreditCardBalance=0.0;
//    public double wallet_balance = 0.0;
    public Payment(double CreditCardBalance){
//        this.User = User;
//        this.wallet_balance = User.getWalletBalance();
//        this.User.setCreditBalance(wallet_balance);
        this.CreditCardBalance = CreditCardBalance;
    }
}
