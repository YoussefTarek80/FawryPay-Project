package com.FawryprojectPay.FawryPay.Logic;

import com.FawryprojectPay.FawryPay.Models.Users.Admin;
import com.FawryprojectPay.FawryPay.Models.Users.Customer;
import com.FawryprojectPay.FawryPay.Models.Users.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerLogic {
    public static List<Customer> usersTable;
    public Transaction transaction;
    public Customer DB;
    public Admin admin;
    public CustomerLogic(){
        usersTable = new ArrayList<>();
    }
    public String CheckRegisteredEMAIL(Customer RegisterUser){
        for (Customer userIT:usersTable){
            if(userIT.getEmail().equals(RegisterUser.getEmail()))
                return "This Email Is Already Exists";
        }
        usersTable.add(RegisterUser);
        return "Registration Has been Success";
    }
    public Customer getUserInfo(String email) {
        for (Customer userIT:usersTable){
            if(userIT.getEmail().equals(email))
                return userIT;
        }
        return null;
    }
    public  String VerifyLoginUser(String Email,String Password){
        for (Customer userIT:usersTable){
            if(userIT.getEmail().equals(Email) && userIT.getPassword().equals(Password))
                return "log in Successfully";
        }
        return "Invalid Login";
    }
    public ArrayList<Transaction> GetTransactions(String email,String password){
        for(Customer customer:usersTable){
            if(customer.getEmail().equals(email)&&customer.getPassword().equals(password)){
                return customer.getTransactionArr();
            }
        }
        return null;
    }
    public String RefundPayment(int transactionID,String Email,String Password){
        for (Customer userIT:usersTable){
            if(userIT.getEmail().equals(Email) && userIT.getPassword().equals(Password)){
                if(userIT.getTransactionArr().size()>transactionID){
                    for (Transaction Tr:userIT.getTransactionArr()) {
                        if(Tr.getTransactionID()==transactionID){
                            userIT.getRefunds().add(Tr);
                            admin.AllRefundedTransactions.add(Tr);
                            return "Refund Sent To Admin...";
                        }
                    }
                }
                else{
                    return "Transaction not Found...";
                }
            }
        }
        return "User Not Found...";
    }
}
