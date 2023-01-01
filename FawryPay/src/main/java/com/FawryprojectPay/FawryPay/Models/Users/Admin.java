package com.FawryprojectPay.FawryPay.Models.Users;

import com.FawryprojectPay.FawryPay.Models.Payment.Payment;
import com.FawryprojectPay.FawryPay.Models.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Admin {
    private String Email;
    private String Password;
    public static ArrayList<Transaction> AllRefundedTransactions;
    public static ArrayList<Payment> AllWalletTransactions;
    public void SetEmail(String email){
        this.Email=email;
    }
    public void SetPassword(String password){
        this.Password=password;
    }
    public String getPassword() {
        return Password;
    }
    public String getEmail() { return Email;}
    public HashMap<String,String> RegisteredAdmins=new HashMap<>();
    public  Admin() {
        RegisteredAdmins.put("youssef@admin.com","1234");
        AllRefundedTransactions=new ArrayList<>();
        AllWalletTransactions=new ArrayList<>();
    }
}
