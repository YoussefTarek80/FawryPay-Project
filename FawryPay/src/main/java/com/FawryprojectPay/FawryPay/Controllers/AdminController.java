package com.FawryprojectPay.FawryPay.Controllers;

import com.FawryprojectPay.FawryPay.Logic.AdminLogic;
import com.FawryprojectPay.FawryPay.Models.Payment.Payment;
import com.FawryprojectPay.FawryPay.Models.Users.Transaction;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/Admin/GetRegisters/{AdminEmail}/{AdminPassword}")
    public ArrayList<String> GetCustomersEmails(@PathVariable(value = "AdminEmail") String AdminEmail ,
                                                @PathVariable(value = "AdminPassword") String AdminPassword){
        return adminLogic.GetCustomersEmails(AdminEmail,AdminPassword);}

    @GetMapping(value = "/Admin/GetTransactions/{AdminEmail}/{AdminPassword}")
    public ArrayList<Transaction> GetTransactions(@RequestParam(required = false) String Email,
                                                  @PathVariable(value = "AdminEmail") String AdminEmail ,
                                                  @PathVariable(value = "AdminPassword") String AdminPassword){
        return adminLogic.GetTransactions(Email,AdminEmail,AdminPassword);}

    @GetMapping(value = "/Admin/GetWalletTransactions/{AdminEmail}/{AdminPassword}")
    public ArrayList<Payment> GetWalletTransactions(@PathVariable(value = "AdminEmail") String AdminEmail ,
                                                    @PathVariable(value = "AdminPassword") String AdminPassword){
        return adminLogic.GetWalletTransactions(AdminEmail,AdminPassword);}

    @GetMapping(value = "/Admin/GetRefunds/{AdminEmail}/{AdminPassword}")
    public ArrayList<Transaction> getAllRefundedTransactions(@PathVariable(value = "AdminEmail") String AdminEmail ,
                                                  @PathVariable(value = "AdminPassword") String AdminPassword){
        return adminLogic.getAllRefundedTransactions(AdminEmail,AdminPassword);}
    @PostMapping(value = "/Admin/ApproveRefund/{AdminEmail}/{AdminPassword}")
    public String ApproveRefund(@RequestParam(required = false) int TransactionID,@RequestParam(required = false) String Email,
                                @PathVariable(value = "AdminEmail") String AdminEmail ,
                                @PathVariable(value = "AdminPassword") String AdminPassword,
                                @RequestParam(required = false) String State){
        return adminLogic.ApproveRefund(AdminEmail,AdminPassword,Email,TransactionID,State); }
}
