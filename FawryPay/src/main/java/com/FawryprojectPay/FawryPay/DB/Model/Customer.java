package com.FawryprojectPay.FawryPay.DB.Model;

import lombok.Getter;
import lombok.Setter;

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
//    public void setUserName(String UserName) {this.UserName = UserName;}
//    public void setEmail(String Email) {this.Email = Email;}
//    public void setPassword(String Password) {this.Password = Password;}
//    public String getUserName() {return UserName;}
//    public String getEmail() {return Email;}
//    public String getPassword() {return Password;}
//    public double getWalletBalance() {return WalletBalance;}
//    public void setWalletBalance(double walletBalance) {WalletBalance = walletBalance;}
//    public double getCreditBalance() {return CreditBalance;}
//    public void setCreditBalance(double CreditBalance) {this.CreditBalance = CreditBalance;}
}
