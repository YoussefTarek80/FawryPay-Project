package com.FawryprojectPay.FawryPay.Models.Users;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Transaction {
    private int TransactionID;
    private double TransactionAmount ;
    private String ServiceName;
    private String Email;
    public Transaction(double transactionAmount, String serviceName,int TransactionID,String Email) {
        this.TransactionAmount = transactionAmount;
        this.ServiceName = serviceName;
        this.TransactionID=TransactionID+1;
        this.Email=Email;
    }
}
