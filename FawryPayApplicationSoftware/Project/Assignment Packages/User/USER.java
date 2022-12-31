package User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Payment.Wallet;

public class USER {
    private String Email;
    private String Password;
    Wallet wallet = new Wallet();
    List<String> UserTransactions = new ArrayList<>();

//    private int TransctionCount=0;
    Scanner scanner = new Scanner(System.in);
    public void SetEmail(String email){
        this.Email=email;
    }
    public void SetPassword(String password){
        this.Password=password;
    }
    public String getPassword() {
        return Password;
    }
    public String getEmail() {
        return Email;
    }
//    public void LoginForm(){//update in last
//        System.out.println("Enter Email : ");
//        String email;
//        email = scanner.next();
//        System.out.println("Enter Password : ");
//        String pass;
//        pass = scanner.next();
//        this.Email = email;
//        this.Password = pass;
//    }
}
