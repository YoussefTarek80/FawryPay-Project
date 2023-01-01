package com.FawryprojectPay.FawryPay.Logic;

import com.FawryprojectPay.FawryPay.Models.Services.Donations;
import com.FawryprojectPay.FawryPay.Models.Services.LandlineServices;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ServicesLogic {
    public ServicesLogic(){}
    Donations donations=new Donations();
    LandlineServices landlineServices=new LandlineServices();
    public HashMap<String,String> Search(String name){
        if(name.equals("Donation")){
            return donations.DonationsHS;
        }
        else if(name.equals("LandLine")){
            return landlineServices.LandLineHS;
        }
        return null;
    }


}