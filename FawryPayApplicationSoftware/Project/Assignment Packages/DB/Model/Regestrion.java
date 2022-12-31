package DB.Model;

import java.util.Scanner;

public class Regestrion {

    private String UserName;
    private String Password;
    private String Email;

    private int id;

//    Scanner scanner = new Scanner(System.in);
//    private double WalletBalance=0;

    public Regestrion(int id, String UserName,String password,String Email) {
        this.id = id;
        this.UserName = UserName;
        this.Password = password;
        this.Email = Email;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public String getUserName() {
        return UserName;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getPassword() {
        return Password;
    }
    public int getid() {
        return id;
    }
    public void setEmail(String Email) {
        this.Email = Email;

    }
    public String getEmail() {
        return Email;
    }



//    @Override
//    public String toString() {
//        return "[WalletBalance=" + WalletBalance + ", UserName=" + UserName + ", Password=" + Password + ", Email=" + Email + "]";
//    }


}
