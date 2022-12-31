//package com.FawryprojectPay.FawryPay.Services;
//
//
//import com.FawryprojectPay.FawryPay.DB.Logic.Verifiable;
//import com.FawryprojectPay.FawryPay.Payment.Cash;
//import com.FawryprojectPay.FawryPay.Payment.CreditCard;
//import com.FawryprojectPay.FawryPay.User.USER;
//import com.FawryprojectPay.FawryPay.View.Form;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Donations implements Service {
//    Scanner scanner = new Scanner(System.in);
//    HashMap<String,String>Donations = new HashMap<>(6);
//    public void SetDonations(){
//        Donations.put("57357" ,"Cancer Hospital");
//        Donations.put("500500","El-Nas Hospital");
//        Donations.put("10019" ,"Nile School");
//        Donations.put("10020" ,"Future School");
//        Donations.put("2020"  ,"Resala");
//        Donations.put("2021"  ,"ElOrman");
//    }
//    public boolean Donate(USER user, Verifiable V, double Donation){
//            System.out.println("------------");
//            System.out.println("1-CreditCard");
//            System.out.println("2-Wallet    ");
//            System.out.println("3-Cash      ");
//            System.out.println("------------");
//            System.out.print  ("Enter Choice : ");
//            int i = scanner.nextInt();
//            if (i == 1) {
//                CreditCard card = new CreditCard();
//                Form f = new Form();
//                f.CreditCardForm(card);
//                if (card.pay(Donation)) {
//                    System.out.println("Success Process");
//                    System.out.println("Card Balance : " + card.getBalanceCreditCard());
//                    return true;
//                }
//                else {
//                    System.out.println("Card Not Have Enough Money ");
//                    return false;
//                }
//            }
//            else if (i == 2) {
//                if (V.UserWallet.get(user.getEmail()).pay(Donation)) {
//                    System.out.println("Success Process ");
//                    System.out.println("Your Wallet Balance Now is : " + V.UserWallet.get(user.getEmail()).getBalanceWallet());
//                    return true;
//                } else {
//                    System.out.println(" You haven't enough money in Wallet ");
//                    return false;
//                }
//            } else if (i == 3) {
//                Cash C = new Cash();
//                C.setCashON(true);
//                System.out.println("Cash Paid Success");
//                return true;
//            }
//            else {
//                System.out.println("Wrong Choice!");
//                return false;
//            }
//    }
//
//    @Override
//    public void update(int setDiscount) {
//    }
//}
//
