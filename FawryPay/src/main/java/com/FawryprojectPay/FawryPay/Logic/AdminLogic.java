package com.FawryprojectPay.FawryPay.Logic;

import com.FawryprojectPay.FawryPay.Models.Payment.Payment;
import com.FawryprojectPay.FawryPay.Models.Users.Admin;
import com.FawryprojectPay.FawryPay.Models.Users.Customer;
import com.FawryprojectPay.FawryPay.Models.Users.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminLogic {
    Admin admin=new Admin();
    CustomerLogic DB;
    public String VerifyLoginAdmin(String email, String password) {
        if(admin.RegisteredAdmins.containsKey(email)&&admin.RegisteredAdmins.get(email).equals(password)){
            return "Admin Login Successfully...";
        }
        return "Admin Not Found...";
    }
    public ArrayList<String> GetCustomersEmails(String AdminEmail,String AdminPassword){
        if(admin.RegisteredAdmins.get(AdminEmail).contains(AdminPassword)) {
            ArrayList<String> Emails = new ArrayList<>();
            for (Customer customer : DB.usersTable) {
                Emails.add(customer.getEmail());
            }
            return Emails;
        }
        return null;
    }
    public ArrayList<Transaction> GetTransactions(String email,String AdminEmail,String AdminPassword){
        if(admin.RegisteredAdmins.get(AdminEmail).contains(AdminPassword)){
            for(Customer customer:DB.usersTable){
                if(customer.getEmail().equals(email)){
                    return customer.getTransactionArr();
                }
            }
            return null;
        }
        return null;
    }
    public ArrayList<Transaction> getAllRefundedTransactions(String AdminEmail,String AdminPassword) {
        if(admin.RegisteredAdmins.get(AdminEmail).contains(AdminPassword)){
            return admin.AllRefundedTransactions;
        }
        return null;
    }
    public ArrayList<Payment> GetWalletTransactions(String AdminEmail, String AdminPassword) {
        if(admin.RegisteredAdmins.get(AdminEmail).contains(AdminPassword)){
            return admin.AllWalletTransactions;
        }
        return null;
    }
    public String ApproveRefund(String AdminEmail,String AdminPassword,String Email,int TransactionID,String State){
        if(State.equals("Accept")) {
            if (admin.RegisteredAdmins.get(AdminEmail).equals(AdminPassword)) {
                for (Customer customer : DB.usersTable) {
                    if (customer.getEmail().equals(Email)) {
                        for (Transaction Tr : admin.AllRefundedTransactions) {
                            if (Tr.getTransactionID() == TransactionID) {
                                admin.AllRefundedTransactions.remove(Tr);
                                customer.getTransactionArr().remove(Tr);
                                customer.getRefunds().remove(Tr);
                                customer.setWalletBalance(customer.getWalletBalance() + Tr.getTransactionAmount());
                                return "Refund Approved TransactionID :" + TransactionID + ", Email : " + customer.getEmail();
                            }
                        }
                        return "TransactionID Wrong ... ";
                    }
                }
                return "User Not Found...";
            }
            return "Admin Not Found...";
        }
        else {
            if (admin.RegisteredAdmins.get(AdminEmail).equals(AdminPassword)) {
                for (Customer customer : DB.usersTable) {
                    if (customer.getEmail().equals(Email)) {
                        for (Transaction Tr : admin.AllRefundedTransactions) {
                            if (Tr.getTransactionID() == TransactionID) {
                                admin.AllRefundedTransactions.remove(Tr);
                                customer.getRefunds().remove(Tr);
                                return "Refund Rejected..";
                            }
                        }
                        return "TransactionID Wrong ... ";
                    }
                }
                return "User Not Found...";
            }
            return "Admin Not Found...";
        }
    }
}
