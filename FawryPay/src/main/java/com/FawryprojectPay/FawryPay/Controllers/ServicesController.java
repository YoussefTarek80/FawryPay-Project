package com.FawryprojectPay.FawryPay.Controllers;

import com.FawryprojectPay.FawryPay.Logic.CustomerLogic;
import com.FawryprojectPay.FawryPay.Logic.ServicesLogic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ServicesController {
    ServicesLogic servicesLogic;
    CustomerLogic userLogic;
    ServicesController(ServicesLogic servicesLogic){
        this.servicesLogic=new ServicesLogic();
    }
    @GetMapping(value = "/Search")
    public HashMap<String,String> Search(@RequestParam(required = false)String name)
    {
        return servicesLogic.Search(name);
    }
}
