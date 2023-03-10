package com.FawryprojectPay.FawryPay.Controllers;

import com.FawryprojectPay.FawryPay.Logic.CustomerLogic;
import com.FawryprojectPay.FawryPay.Models.Users.Customer;
import com.FawryprojectPay.FawryPay.Models.Users.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CustomerController {
    private CustomerLogic DB;
    public CustomerController(CustomerLogic database){this.DB=database;}

    @PostMapping(value = "/SignUp")
    public String RegisterUser(@RequestBody Customer UserRIG) {
        return DB.CheckRegisteredEMAIL(UserRIG);}

    @GetMapping (value = "/USER")
    public Customer getUserInfo(
            @RequestParam (required = false) String Email) {
        return DB.getUserInfo(Email);}

    @GetMapping(value = "/SignUp/Login")
    public String VerifyLoginUser(
            @RequestParam (required = false) String Email,
            @RequestParam (required = false) String Password){
        return DB.VerifyLoginUser(Email,Password);}
    @GetMapping(value = "/USER/GetTransactions")
    public ArrayList<Transaction> GetTransactions(
            @RequestParam (required = false) String Email,
            @RequestParam (required = false) String password){
        return DB.GetTransactions(Email,password);}

    @PostMapping(value = "/USER/Refund")
    public String RefundPayment(    @RequestParam (required = false) int transactionID,
                                    @RequestParam (required = false) String Email,
                                    @RequestParam (required = false) String Password) {
        return DB.RefundPayment(transactionID,Email,Password);
    }
}
