package com.FawryprojectPay.FawryPay.Logic;

import com.FawryprojectPay.FawryPay.Models.Users.Admin;
import com.FawryprojectPay.FawryPay.Models.Users.Customer;
import com.FawryprojectPay.FawryPay.Models.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminLogic {
    Admin admin=new Admin();
    UserLogic DB;
    public String VerifyLoginAdmin(String email, String password) {
        if(admin.RegisteredAdmins.containsKey(email)&&admin.RegisteredAdmins.get(email).equals(password)){
            return "Admin Login Successfully...";
        }
        return "Admin Not Found...";
    }
    public ArrayList<String> GetCustomersEmails(){
        ArrayList<String> Emails=new ArrayList<>();
        for (Customer customer:DB.usersTable) {
            Emails.add(customer.getEmail());
        }
        return Emails;
    }
    public ArrayList<Transaction> GetTransactions(String email){
        for(Customer customer:DB.usersTable){
            if(customer.getEmail().equals(email)){
                return customer.getTransctionArr();
            }
        }
        return null;
    }
//    public Customer getUserTransactions(String email) {
//        for (Customer userIT:DB.usersTable){
//            if(userIT.getEmail().equals(email))
//
//                return userIT;
//        }
//        return null;
//    }
}
