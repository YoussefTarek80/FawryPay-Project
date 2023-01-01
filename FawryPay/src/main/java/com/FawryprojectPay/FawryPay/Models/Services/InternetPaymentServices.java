package com.FawryprojectPay.FawryPay.Models.Services;

import com.FawryprojectPay.FawryPay.Models.Discount.Discount;

public class InternetPaymentServices implements Service{
    public static double dis=0.0;
    Discount Dis;
    InternetPaymentServices(){}
    InternetPaymentServices(Discount D){
        this.Dis=D;
        Dis.registerObserver(this);
    }
    public void update(int setDiscount) {
        this.dis+=setDiscount;
    }
    public double GetDiscount(){
        return dis;
    }
}
