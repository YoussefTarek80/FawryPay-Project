package com.FawryprojectPay.FawryPay.Models;

import lombok.*;

@Setter
@Getter
public class Customer {
    private String UserName;
    private String Password;
    private String Email;
    private double WalletBalance;
    private double CreditBalance;
    public Customer(String UserName,String Email,String Password) {
        this.UserName = UserName;
        this.Email = Email;
        this.Password = Password;
        CreditBalance=0.0;
        WalletBalance=0.0;
    }
}
