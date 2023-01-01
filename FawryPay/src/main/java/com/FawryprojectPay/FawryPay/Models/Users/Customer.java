package com.FawryprojectPay.FawryPay.Models.Users;

import com.FawryprojectPay.FawryPay.Models.Payment.Payment;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;



@Setter
@Getter
public class Customer {
    private String UserName;
    private String Password;
    private String Email;
    private double WalletBalance;
    private double CreditBalance;

    private  ArrayList<Transaction> TransactionArr =new ArrayList<>();
    private  ArrayList<Payment> TransactionWallet=new ArrayList<>();
    private  ArrayList<Transaction> Refunds=new ArrayList<>();

    public Customer(String UserName,String Email,String Password) {
        this.UserName = UserName;
        this.Email = Email;
        this.Password = Password;
        CreditBalance=0.0;
        WalletBalance=0.0;
    }
    public void AddTransaction(Transaction transaction){
        this.TransactionArr.add(transaction);
    }
    public void AddTransaction(Payment payment){
        this.TransactionWallet.add(payment);
    }
}
