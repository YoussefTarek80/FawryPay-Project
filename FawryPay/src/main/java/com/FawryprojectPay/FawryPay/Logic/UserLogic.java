package com.FawryprojectPay.FawryPay.Logic;
import com.FawryprojectPay.FawryPay.Models.Customer;
import com.FawryprojectPay.FawryPay.Models.Transaction;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class UserLogic {
    public static List<Customer> usersTable;
    Transaction transaction;
    public UserLogic(){
        usersTable = new ArrayList<>();
    }
    public String CheckRegisteredEMAIL(Customer RegisterUser){
        for (Customer userIT:usersTable){
            if(userIT.getEmail().equals(RegisterUser.getEmail()))
                return "This Email Is Already Exists";
        }
//        transaction=new Transaction(10,"lls");
//        RegisterUser.AddTransaction(transaction);
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
}
