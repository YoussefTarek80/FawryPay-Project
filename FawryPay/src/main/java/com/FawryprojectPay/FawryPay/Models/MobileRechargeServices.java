//package com.FawryprojectPay.FawryPay.Services;
//
//import com.FawryprojectPay.FawryPay.Discount.Discount;
//import com.FawryprojectPay.FawryPay.Providers.*;
//
//public class MobileRechargeServices implements FactoryProvider,Service {
//    public static double dis=0.0;
//    Discount Dis;
//    MobileRechargeServices(){}
//    MobileRechargeServices(Discount D){
//        this.Dis=D;
//        Dis.registerObserver(this);
//    }
//    @Override
//    public Provider CreateProvider(int type) {
//        if(type==1){
//            return new WE();
//        }
//        else if(type==2){
//            return new Vodafone();
//        }
//        else if(type==3){
//            return new Etisalat();
//        }
//        else if(type==4){
//            return new Orange();
//        }
//        else{
//            return null;
//        }
//    }
//    public void update(int setDiscount) {
//        this.dis+=setDiscount;
//    }
//    public double GetDiscount(){
//        return dis;
//    }
//}
