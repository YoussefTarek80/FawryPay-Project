package com.FawryprojectPay.FawryPay.Models;

import lombok.*;

import java.util.ArrayList;

@Setter
@Getter

public class Customer {
    private String UserName;
    private String Password;
    private String Email;
    private double WalletBalance;
    private double CreditBalance;

    private ArrayList<Transaction> TransctionArr;

    public Customer(String UserName,String Email,String Password) {
        this.UserName = UserName;
        this.Email = Email;
        this.Password = Password;
        CreditBalance=0.0;
        WalletBalance=0.0;
        TransctionArr=new ArrayList<>();
    }
    public  void AddTransaction(Transaction transaction){
        this.TransctionArr.add(transaction);
    }

}
