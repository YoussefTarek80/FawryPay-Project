package com.FawryprojectPay.FawryPay.Models.Payment;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Payment {
    private double WalletBalance;
    private String Email;
    private String Message;
    public Payment(double WalletBalance, String Email, String Message) {
        this.WalletBalance = WalletBalance;
        this.Email = Email;
        this.Message = Message;
    }
}
