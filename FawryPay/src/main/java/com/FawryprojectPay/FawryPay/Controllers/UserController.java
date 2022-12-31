package com.FawryprojectPay.FawryPay.Controllers;

import com.FawryprojectPay.FawryPay.Logic.UserLogic;
import com.FawryprojectPay.FawryPay.Models.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserLogic DB;
    public UserController(UserLogic database){this.DB=database;}
    @PostMapping(value = "/SignUp")
    public String RegisterUser(
            @RequestBody Customer UserRIG) {
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
}
