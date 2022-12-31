package com.FawryprojectPay.FawryPay.Models;

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
}
