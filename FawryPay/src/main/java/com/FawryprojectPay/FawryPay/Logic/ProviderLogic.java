package com.FawryprojectPay.FawryPay.Logic;

import com.FawryprojectPay.FawryPay.Models.Payment.Payment;
import com.FawryprojectPay.FawryPay.Models.Users.Customer;
import com.FawryprojectPay.FawryPay.Models.Users.Transaction;

public class ProviderLogic {
    public Payment payment;
    public CustomerLogic DB;
    public Transaction transaction;
    ProviderLogic(){}
    public String providerMobile(String Number,String Email,String ProviderType,double Amount,String PayMethod,String Password){
//        MobileRechargeServices MRS =new MobileRechargeServices();
//        amount -= (amount *(discount/100.0));
        if (ProviderType.equals("WE")){
            for (Customer customer:DB.usersTable) {
                if(customer.getEmail().equals(Email)&&customer.getPassword().equals(Password)){
                    if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='5'&&Number.length()==11){
                        if(PayMethod.equals("Wallet")){
                            if(customer.getWalletBalance()>=Amount){
                                customer.setWalletBalance(customer.getWalletBalance()-Amount);
                                transaction=new Transaction(Amount,"MobileRechargeService : "+
                                        ProviderType+" By Wallet , Number: "+Number,customer.getTransactionArr().size(),customer.getEmail());
                                customer.AddTransaction(transaction);
                                return "Balance Sent to "+Number;
                            }
                            else return "Your Wallet hasn't not enough Money";
                        }
                        else if (PayMethod.equals("CreditCard")) {
                            if(customer.getCreditBalance()>=Amount){
                                customer.setCreditBalance(customer.getCreditBalance()-Amount);
                                transaction=new Transaction(Amount,"MobileRechargeService : "+
                                        ProviderType+" By CreditCard, Number: "+Number,customer.getTransactionArr().size(),customer.getEmail());
                                customer.AddTransaction(transaction);
                                return "Balance Sent to "+Number;
                            }
                            else return "Your Wallet hasn't not enough Money";
                        }
                        else if(PayMethod.equals("Cash")) return "[CASH Paid] , Balance Sent to "+Number;
                        else return "Invalid Payment Method...";
                    }
                    else return "Invalid Number";
                }
            }
            return "User Not Found...";
        }
       else if(ProviderType.equals("Vodafone")){
                for (Customer customer: DB.usersTable) {
                    if(customer.getEmail().equals(Email)&&customer.getPassword().equals(Password)){
                        if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='0'&&Number.length()==11) {
                             if(PayMethod.equals("Wallet")){
                                 if (customer.getWalletBalance() >= Amount) {
                                    customer.setWalletBalance(customer.getWalletBalance() - Amount);
                                    transaction = new Transaction(Amount, "MobileRechargeService : " +
                                            ProviderType + " , Number: " + Number, customer.getTransactionArr().size(), customer.getEmail());
                                    customer.AddTransaction(transaction);
                                    return "Balance Sent to " + Number;
                                }
                                 else return "Your Wallet hasn't not enough Money";
                            }
                            else if (PayMethod.equals("CreditCard")) {
                                if(customer.getCreditBalance()>=Amount){
                                    customer.setCreditBalance(customer.getCreditBalance()-Amount);
                                    transaction=new Transaction(Amount,"MobileRechargeService : "+
                                            ProviderType+" By CreditCard, Number: "+Number,customer.getTransactionArr().size(),customer.getEmail());
                                    customer.AddTransaction(transaction);
                                    return "Balance Sent to "+Number;
                                }
                                else return "Your CreditCard hasn't not enough Money..";
                            }
                            else if(PayMethod.equals("Cash")) return "[CASH Paid] , Balance Sent to "+Number;
                            else return "Invalid Payment Method...";
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
                if(customer.getEmail().equals(Email)&&customer.getPassword().equals(Password)){
                    if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='2'&&Number.length()==11) {
                        if (PayMethod.equals("Wallet")) {
                            if (customer.getWalletBalance() >= Amount) {
                                customer.setWalletBalance(customer.getWalletBalance() - Amount);
                                transaction = new Transaction(Amount, "MobileRechargeService : " +
                                        ProviderType + " , Number: " + Number, customer.getTransactionArr().size(), customer.getEmail());
                                customer.AddTransaction(transaction);
                                return "Balance Sent to " + Number;
                            }
                            else return "Your Wallet hasn't not enough Money";
                        }
                        else if (PayMethod.equals("CreditCard")) {
                            if(customer.getCreditBalance()>=Amount){
                                customer.setCreditBalance(customer.getCreditBalance()-Amount);
                                transaction=new Transaction(Amount,"MobileRechargeService : "+
                                        ProviderType+" By CreditCard, Number: "+Number,customer.getTransactionArr().size(),customer.getEmail());
                                customer.AddTransaction(transaction);
                                return "Balance Sent to "+Number;
                            }
                            else return "Your CreditCard hasn't not enough Money..";
                        }
                        else if(PayMethod.equals("Cash")) return "[CASH Paid] , Balance Sent to "+Number;
                        else return "Invalid Payment Method...";
                    }
                    else return "Invalid Number";
                }
            }
            return "User Not Found...";
        }
       else if(ProviderType.equals("Etisalat")){
            for (Customer customer: DB.usersTable) {
                if(customer.getEmail().equals(Email)&&customer.getPassword().equals(Password)){
                    if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='1'&&Number.length()==11){
                    if(PayMethod.equals("Wallet")){
                        if(customer.getWalletBalance()>=Amount){
                            customer.setWalletBalance(customer.getWalletBalance()-Amount);
                            transaction=new Transaction(Amount,"MobileRechargeService : "+
                                    ProviderType+" , Number: "+Number,customer.getTransactionArr().size(),customer.getEmail());
                            customer.AddTransaction(transaction);
                            return "Balance Sent to "+Number;
                        }
                        else return "Your Wallet hasn't not enough Money";
                    }
                    else if (PayMethod.equals("CreditCard")) {
                        if(customer.getCreditBalance()>=Amount){
                            customer.setCreditBalance(customer.getCreditBalance()-Amount);
                            transaction=new Transaction(Amount,"MobileRechargeService : "+
                                    ProviderType+" By CreditCard, Number: "+Number,customer.getTransactionArr().size(),customer.getEmail());
                            customer.AddTransaction(transaction);
                            return "Balance Sent to "+Number;
                        }
                        else return "Your CreditCard hasn't not enough Money..";
                    }
                    else if(PayMethod.equals("Cash")) return "[CASH Paid] , Balance Sent to "+Number;
                    else return "Invalid Payment Method...";
                    }
                    else return "Invalid Number";
                }
            }
            return "User Not Found...";
        }
       return "Provider Not Found...";
    }
    public String providerInternet(String Number,String Email,String ProviderType,double Amount,String PayMethod,String Password){
//        MobileRechargeServices MRS =new MobileRechargeServices();
//        amount -= (amount *(discount/100.0));
        if (ProviderType.equals("WE")){
            for (Customer customer:DB.usersTable) {
                if(customer.getEmail().equals(Email)&&customer.getPassword().equals(Password)){
                    if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='5'&&Number.length()==11){
                        if(PayMethod.equals("Wallet")){
                            if(customer.getWalletBalance()>=Amount){
                                customer.setWalletBalance(customer.getWalletBalance()-Amount);
                                transaction=new Transaction(Amount,"InternetRechargeService : "+
                                        ProviderType+" By Wallet , Number: "+Number,customer.getTransactionArr().size(),customer.getEmail());
                                customer.AddTransaction(transaction);
                                return "Balance Sent to "+Number;
                            }
                            else return "Your Wallet hasn't not enough Money";
                        }
                        else if (PayMethod.equals("CreditCard")) {
                            if(customer.getCreditBalance()>=Amount){
                                customer.setCreditBalance(customer.getCreditBalance()-Amount);
                                transaction=new Transaction(Amount,"InternetRechargeService : "+
                                        ProviderType+" By CreditCard, Number: "+Number,customer.getTransactionArr().size(),customer.getEmail());
                                customer.AddTransaction(transaction);
                                return "Balance Sent to "+Number;
                            }
                            else return "Your Wallet hasn't not enough Money";
                        }
                        else if(PayMethod.equals("Cash")) return "[CASH Paid] , Balance Sent to "+Number;
                        else return "Invalid Payment Method...";
                    }
                    else return "Invalid Number";
                }
            }
            return "User Not Found...";
        }
       else if(ProviderType.equals("Vodafone")){
                for (Customer customer: DB.usersTable) {
                    if(customer.getEmail().equals(Email)&&customer.getPassword().equals(Password)){
                        if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='0'&&Number.length()==11) {
                             if(PayMethod.equals("Wallet")){
                                 if (customer.getWalletBalance() >= Amount) {
                                    customer.setWalletBalance(customer.getWalletBalance() - Amount);
                                    transaction = new Transaction(Amount, "InternetRechargeService : " +
                                            ProviderType + " , Number: " + Number, customer.getTransactionArr().size(), customer.getEmail());
                                    customer.AddTransaction(transaction);
                                    return "Balance Sent to " + Number;
                                }
                                 else return "Your Wallet hasn't not enough Money";
                            }
                            else if (PayMethod.equals("CreditCard")) {
                                if(customer.getCreditBalance()>=Amount){
                                    customer.setCreditBalance(customer.getCreditBalance()-Amount);
                                    transaction=new Transaction(Amount,"InternetRechargeService : "+
                                            ProviderType+" By CreditCard, Number: "+Number,customer.getTransactionArr().size(),customer.getEmail());
                                    customer.AddTransaction(transaction);
                                    return "Balance Sent to "+Number;
                                }
                                else return "Your CreditCard hasn't not enough Money..";
                            }
                            else if(PayMethod.equals("Cash")) return "[CASH Paid] , Balance Sent to "+Number;
                            else return "Invalid Payment Method...";
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
                if(customer.getEmail().equals(Email)&&customer.getPassword().equals(Password)){
                    if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='2'&&Number.length()==11) {
                        if (PayMethod.equals("Wallet")) {
                            if (customer.getWalletBalance() >= Amount) {
                                customer.setWalletBalance(customer.getWalletBalance() - Amount);
                                transaction = new Transaction(Amount, "InternetRechargeService : " +
                                        ProviderType + " , Number: " + Number, customer.getTransactionArr().size(), customer.getEmail());
                                customer.AddTransaction(transaction);
                                return "Balance Sent to " + Number;
                            }
                            else return "Your Wallet hasn't not enough Money";
                        }
                        else if (PayMethod.equals("CreditCard")) {
                            if(customer.getCreditBalance()>=Amount){
                                customer.setCreditBalance(customer.getCreditBalance()-Amount);
                                transaction=new Transaction(Amount,"InternetRechargeService : "+
                                        ProviderType+" By CreditCard, Number: "+Number,customer.getTransactionArr().size(),customer.getEmail());
                                customer.AddTransaction(transaction);
                                return "Balance Sent to "+Number;
                            }
                            else return "Your CreditCard hasn't not enough Money..";
                        }
                        else if(PayMethod.equals("Cash")) return "[CASH Paid] , Balance Sent to "+Number;
                        else return "Invalid Payment Method...";
                    }
                    else return "Invalid Number";
                }
            }
            return "User Not Found...";
        }
       else if(ProviderType.equals("Etisalat")){
            for (Customer customer: DB.usersTable) {
                if(customer.getEmail().equals(Email)&&customer.getPassword().equals(Password)){
                    if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='1'&&Number.length()==11){
                    if(PayMethod.equals("Wallet")){
                        if(customer.getWalletBalance()>=Amount){
                            customer.setWalletBalance(customer.getWalletBalance()-Amount);
                            transaction=new Transaction(Amount,"InternetRechargeService : "+
                                    ProviderType+" , Number: "+Number,customer.getTransactionArr().size(),customer.getEmail());
                            customer.AddTransaction(transaction);
                            return "Balance Sent to "+Number;
                        }
                        else return "Your Wallet hasn't not enough Money";
                    }
                    else if (PayMethod.equals("CreditCard")) {
                        if(customer.getCreditBalance()>=Amount){
                            customer.setCreditBalance(customer.getCreditBalance()-Amount);
                            transaction=new Transaction(Amount,"InternetRechargeService : "+
                                    ProviderType+" By CreditCard, Number: "+Number,customer.getTransactionArr().size(),customer.getEmail());
                            customer.AddTransaction(transaction);
                            return "Balance Sent to "+Number;
                        }
                        else return "Your CreditCard hasn't not enough Money..";
                    }
                    else if(PayMethod.equals("Cash")) return "[CASH Paid] , Balance Sent to "+Number;
                    else return "Invalid Payment Method...";
                    }
                    else return "Invalid Number";
                }
            }
            return "User Not Found...";
        }
       return "Provider Not Found...";
    }
}
