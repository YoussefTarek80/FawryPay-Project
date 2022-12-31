package Providers;

import java.util.Scanner;
import DB.Logic.Verifiable;
import Payment.Cash;
import Payment.CreditCard;
import User.USER;
import View.Form;
public class Orange extends Provider{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void calculateServicePrice(USER user,Verifiable V,String Number,double balance,double dis) {

        if((Number.charAt(0))=='0'&&(Number.charAt(1))=='1'&&(Number.charAt(2))=='2'){
            System.out.println("------------");
            System.out.println("1-CreditCard");
            System.out.println("2-Wallet    ");
            System.out.println("3-Cash      ");
            System.out.println("------------");
            System.out.print("Enter Choice : ");
            int i = scanner.nextInt();
            if(i==1){
                CreditCard card = new CreditCard();
                Form f = new Form();
                f.CreditCardForm(card);
                if(card.pay(balance,dis)){
                    System.out.println("Success Process");
                    System.out.println("Card Balance : " + card.getBalanceCreditCard());
                }
                else{
                    System.out.println("Card Not Have Enough Money ");
                }
            }
            else if (i==2) {
                if(V.UserWallet.get(user.getEmail()).pay(balance,dis)){
                    System.out.println(" Success Process ");
                    System.out.println("Your Balance Now is : "+V.UserWallet.get(user.getEmail()).getBalanceWallet());
                }
                else{
                    System.out.println( " You haven't enough money in Wallet ");
                }
            }
            else if (i==3) {
                Cash C = new Cash();
                C.setCashON(true);
                System.out.println("Cash Paid Success");
            }
//            if(V.UserWallet.get(user.getEmail()).pay(balance,dis)){
//                System.out.println(" Success Process ");
//            }
//            else{
//                System.out.println(" You haven't enough money ");
//            }
        }
        else{
            System.out.println(" The Number is invalid ");

        }

    }
}
