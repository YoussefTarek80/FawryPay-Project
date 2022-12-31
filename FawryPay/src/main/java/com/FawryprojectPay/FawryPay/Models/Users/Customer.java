package com.FawryprojectPay.FawryPay.Models.Users;

import com.FawryprojectPay.FawryPay.Models.Transaction;
import lombok.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

//import static com.FawryprojectPay.FawryPay.Models.Transaction.count;

@Setter
@Getter
public class Customer {
    private String UserName;
    private String Password;
    private String Email;
    private double WalletBalance;
    private double CreditBalance;

    private  ArrayList<Transaction> TransctionArr=new ArrayList<>();

    public Customer(String UserName,String Email,String Password) {
        this.UserName = UserName;
        this.Email = Email;
        this.Password = Password;
        CreditBalance=0.0;
        WalletBalance=0.0;
    }
    public  void AddTransaction(Transaction transaction){
        this.TransctionArr.add(transaction);
    }


}
