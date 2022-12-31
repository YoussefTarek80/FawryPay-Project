package com.FawryprojectPay.FawryPay.DB.Logic;
import com.FawryprojectPay.FawryPay.DB.Model.Customer;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class Database {
    public static List<Customer> usersTable;
    public Database(){
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
}
