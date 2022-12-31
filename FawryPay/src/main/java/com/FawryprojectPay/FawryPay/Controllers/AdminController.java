package com.FawryprojectPay.FawryPay.Controllers;

import com.FawryprojectPay.FawryPay.Logic.AdminLogic;
import com.FawryprojectPay.FawryPay.Models.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AdminController {
    private AdminLogic adminLogic;
    public AdminController(AdminLogic adminLogic){
        this.adminLogic = adminLogic;
    }
    @GetMapping(value = "/Admin/login")
    public String VerifyLoginAdmin(
            @RequestParam(required = false) String Email,
            @RequestParam (required = false) String Password){
        return adminLogic.VerifyLoginAdmin(Email,Password);}
    @GetMapping(value = "/Admin/GetRegisters")
    public ArrayList<String> GetCustomersEmails(){
        return adminLogic.GetCustomersEmails();}

    @GetMapping(value = "/Admin/GetTransactions")
    public ArrayList<Transaction> GetTransactions(@RequestParam(required = false) String Email){
        return adminLogic.GetTransactions(Email);}

}
