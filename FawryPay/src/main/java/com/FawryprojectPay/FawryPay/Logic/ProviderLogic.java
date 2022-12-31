package com.FawryprojectPay.FawryPay.Logic;

import com.FawryprojectPay.FawryPay.Models.Users.Customer;
import com.FawryprojectPay.FawryPay.Models.Payment.Payment;
import com.FawryprojectPay.FawryPay.Models.Transaction;

public class ProviderLogic {
    public Payment payment;
    public UserLogic DB;
    public Transaction transaction;
    ProviderLogic(){}

    public String provider(String Number,String Email,String ProviderType,double Amount){
        if (ProviderType.equals("WE")){
            for (Customer customer:DB.usersTable) {
                if(customer.getEmail().equals(Email)){
                    if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='5'&&Number.length()==11){
                        if(customer.getWalletBalance()>=Amount){

                            customer.setWalletBalance(customer.getWalletBalance()-Amount);
                            transaction=new Transaction(Amount,"MobileRechargeService : "+ProviderType+" , Number: "+Number,customer.getTransctionArr().size());
                            customer.AddTransaction(transaction);
                            return "Balance Sent to "+Number;
                        }
                        else{
                            return "Your Wallet hasn't not enough Money";
                        }
                    }
                    else{
                        return "Invalid Number";
                    }
                }
            }
            return "User Not Found...";
        }
       else if(ProviderType.equals("Vodafone")){
                for (Customer customer: DB.usersTable) {
                    if(customer.getEmail().equals(Email)){
                        if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='0'&&Number.length()==11){
                            if(customer.getWalletBalance()>=Amount){

                                customer.setWalletBalance(customer.getWalletBalance()-Amount);
                                transaction=new Transaction(Amount,"MobileRechargeService : "+ProviderType+" , Number: "+Number,customer.getTransctionArr().size());
                                customer.AddTransaction(transaction);
                                return "Balance Sent to "+Number;
                            }
                            else{
                                return "Your Wallet hasn't not enough Money";
                            }
                        }
                        else{
                            return "Invalid Number";
                        }
                    }
                }
                return "User Not Found...";
        }
       else if(ProviderType.equals("Orange")){
            for (Customer customer: DB.usersTable) {
                if(customer.getEmail().equals(Email)){
                    if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='2'&&Number.length()==11){
                        if(customer.getWalletBalance()>=Amount){

                            customer.setWalletBalance(customer.getWalletBalance()-Amount);
                            transaction=new Transaction(Amount,"MobileRechargeService : "+ProviderType+" , Number: "+Number,customer.getTransctionArr().size());
                            customer.AddTransaction(transaction);
                            return "Balance Sent to "+Number;
                        }
                        else{
                            return "Your Wallet hasn't not enough Money";
                        }
                    }
                    else{
                        return "Invalid Number";
                    }
                }
            }
            return "User Not Found...";
        }
       else if(ProviderType.equals("Etisalat")){
            for (Customer customer: DB.usersTable) {
                if(customer.getEmail().equals(Email)){
                    if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='1'&&Number.length()==11){
                        if(customer.getWalletBalance()>=Amount){

                            customer.setWalletBalance(customer.getWalletBalance()-Amount);
                            transaction=new Transaction(Amount,"MobileRechargeService : "+ProviderType+" , Number: "+Number,customer.getTransctionArr().size());
                            customer.AddTransaction(transaction);
                            return "Balance Sent to "+Number;
                        }
                        else{
                            return "Your Wallet hasn't not enough Money";
                        }
                    }
                    else{
                        return "Invalid Number";
                    }
                }
            }
            return "User Not Found...";
        }
       return "Provider Not Found...";
    }
}
