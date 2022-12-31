package com.FawryprojectPay.FawryPay.Models.Users;

import java.util.HashMap;
import java.util.Scanner;

public class Admin {
    private String Email;
    private String Password;
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
    public String getEmail() { return Email;}
    public HashMap<String,String> RegisteredAdmins=new HashMap<>();
    public  Admin() {
        RegisteredAdmins.put("youssef.tarek1090@gmail.com","1234");
    }
}
