package View;

import Admin.Admin;
import DB.Model.Regestrion;
import Payment.CreditCard;
import User.USER;

import java.util.Scanner;

public class Form {
    Scanner scanner = new Scanner(System.in);
    public void UserForm(USER user){//update in last
        System.out.print("Enter Email : ");
        String email;
        email = scanner.next();
        System.out.print("Enter Password : ");
        String pass;
        pass = scanner.next();
        user.SetEmail(email);
        user.SetPassword(pass);
    }
    public void AdminForm(Admin admin){
        System.out.print("Enter Email : ");
        String email;
        email = scanner.next();
        System.out.print("Enter Password : ");
        String pass;
        pass = scanner.next();
        admin.SetEmail(email);
        admin.SetPassword(pass);
    }
    public void RegisterForm(Regestrion R){//update in last
        System.out.print("Enter User Name : ");
        String Us;
        Us = scanner.next();
        R.setUserName(Us);

        System.out.print("Enter Email : ");
        String email;
        email = scanner.next();
        R.setEmail(email);

        System.out.print("Enter Password : ");
        String pass;
        pass = scanner.next();
        R.setPassword(pass);
    }
    public void CreditCardForm(CreditCard card){
        String ccn;
        System.out.print("Enter CreditCardName : ");ccn = scanner.next();
        card.setCardName(ccn);

        System.out.print("Enter ExpirationDate : ");
        String ccv;
        ccv = scanner.next();
        card.setExpirationDate(ccv);

        System.out.print("Enter CreditCardNumber : ");
        String cn;
        cn = scanner.next();
        card.setCreditCardNumber(cn);

        System.out.print("Enter CreditCardBalance : ");
        double balance;
        balance = scanner.nextDouble();
        card.setBalanceCreditCard(balance);


    }


}
