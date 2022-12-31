package com.FawryprojectPay.FawryPay.Models;
import com.FawryprojectPay.FawryPay.Logic.UserLogic;
import com.FawryprojectPay.FawryPay.Models.Customer;
import com.FawryprojectPay.FawryPay.Models.Service;


import java.util.HashMap;
import java.util.Scanner;

public class LandlineServices implements Service {
    Scanner scanner = new Scanner(System.in);
    public static double dis = 0.0;
    public HashMap<String,String> LandLineHS = new HashMap<>(2);
    //    Discount Dis ;
    public final double MonthlyAmount = 100.0;
    public final double QuarterAmount = 350.0;
    public LandlineServices() {
        LandLineHS.put("100.0","MonthlyAmount");
        LandLineHS.put("350.0","QuarterAmount");
    }



    @Override
    public void update(int setDiscount) {
    }
}
//    LandlineServices(Discount D ){
//        this.Dis=D;
//        Dis.registerObserver(this);
//    }

//    public boolean RechargeMonthlyReceipt(Customer user , UserLogic V, double discount){
//        if (i == 1) {
//            CreditCard card = new CreditCard();
//            Form f = new Form();
//            f.CreditCardForm(card);
//            if (card.pay(this.MonthlyAmount,discount)) {
//                System.out.println("Success Process");
//                System.out.println("Card Balance : " + card.getBalanceCreditCard());
//                return true;
//            }
//            else {
//                System.out.println("Card Not Have Enough Money ");
//                return false;
//            }
//        }
//        else if (i == 2) {
//            if (V.UserWallet.get(user.getEmail()).pay(this.MonthlyAmount,discount)) {
//                System.out.println("Success Process ");
//                System.out.println("Your Wallet Balance Now is : " + V.UserWallet.get(user.getEmail()).getBalanceWallet());
//                return true;
//            } else {
//                System.out.println(" You haven't enough money in Wallet ");
//                return false;
//            }
//        } else if (i == 3) {
//            Cash C = new Cash();
//            C.setCashON(true);
//            System.out.println("Cash Paid Success");
//            return true;
//        }
//        else return false;
//    }
//    public boolean RechargeQuarterReceipt(USER user,Verifiable V,double discount){
//        System.out.println("------------");
//        System.out.println("1-CreditCard");
//        System.out.println("2-Wallet    ");
//        System.out.println("3-Cash      ");
//        System.out.println("------------");
//        System.out.print  ("Enter Choice : ");
//        int i = scanner.nextInt();
//        if (i == 1) {
//            CreditCard card = new CreditCard();
//            Form f = new Form();
//            f.CreditCardForm(card);
//            if (card.pay(this.QuarterAmount,discount)) {
//                System.out.println("Success Process");
//                System.out.println("Card Balance : " + card.getBalanceCreditCard());
//                return true;
//            }
//            else {
//                System.out.println("Card Not Have Enough Money ");
//                return false;
//            }
//        }
//        else if (i == 2) {
//            if (V.UserWallet.get(user.getEmail()).pay(this.QuarterAmount,discount)) {
//                System.out.println("Success Process ");
//                System.out.println("Your Wallet Balance Now is : " + V.UserWallet.get(user.getEmail()).getBalanceWallet());
//                return true;
//            } else {
//                System.out.println(" You haven't enough money in Wallet ");
//                return false;
//            }
//        }
//        else if (i == 3) {
//            Cash C = new Cash();
//            C.setCashON(true);
//            System.out.println("Cash Paid Success");
//            return true;
//        }
//        else {
//            System.out.println("Wrong Choice!");
//            return false;}
//    }
//    @Override
//    public void update(int setDiscount) {
//        this.dis+=setDiscount;
//    }
//    public double GetDiscount(){
//        return dis;
//    }
//}
