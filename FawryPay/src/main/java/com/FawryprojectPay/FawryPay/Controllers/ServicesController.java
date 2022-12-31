package com.FawryprojectPay.FawryPay.Controllers;

import com.FawryprojectPay.FawryPay.Logic.ServicesLogic;
import com.FawryprojectPay.FawryPay.Logic.UserLogic;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class ServicesController {
    ServicesLogic servicesLogic;
    UserLogic userLogic;
    ServicesController(ServicesLogic servicesLogic){
        this.servicesLogic=new ServicesLogic();
    }
    @GetMapping(value = "/Search/Donations")
    public HashMap<String,String> GetDonationList()
    {
        return servicesLogic.GetDonationList();
    }
    @GetMapping(value = "/Search/LLS")
    public HashMap<String,String> GetLandLineServicesList()
    {
        return servicesLogic.GetLandLineServicesList();
    }







}
