package com.FawryprojectPay.FawryPay.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Setter
@Getter
public class Transaction {
    private int TransactionID;
    private double TransactionAmount ;
    private String ServiceName;

//    private ArrayList<Transaction> TransctionArr=new ArrayList<>();

    public Transaction(double transactionAmount, String serviceName,int TransactionID) {
        this.TransactionAmount = transactionAmount;
        this.ServiceName = serviceName;
        this.TransactionID=TransactionID+1;
    }

}
//    public void CreateTransaction(USER user, String ServName, double Amount, Verifiable V){
//
//        if(ServName =="LandlineServices") {
//            this.ServiceName = "LandlineServices";
//            this.TransacationAmount = Amount;
//        }
//        else if (ServName .equals("Donation")) {
//            this.ServiceName = "Donation";
//            this.TransacationAmount = Amount;
//        }
//        else if (ServName.equals("InternetPaymentServices")) {
//            this.ServiceName = "InternetPaymentServices";
//            this.TransacationAmount = Amount;
//        }
//        else if (ServName.equals("MobileRechargeServices")) {
//            this.ServiceName = "MobileRechargeServices";
//            this.TransacationAmount = Amount;
//        }
////        user.UserTransactions.add(this.toString());
//        V.UserTransactions.get(user.getEmail()).add(this.toString());
////        V.UserTransactions.get(user).;
//        this.TransactionNumber++;
//    }
//    public String toString(){
//        return "["+this.TransactionNumber+"."+"ServiceName=" + this.ServiceName +" || TransctionAmount= "+this.TransacationAmount + "]\n";
//    }