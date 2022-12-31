package com.FawryprojectPay.FawryPay.Logic;

import com.FawryprojectPay.FawryPay.Models.*;
import com.FawryprojectPay.FawryPay.Models.Customer;
import com.FawryprojectPay.FawryPay.Models.Payment;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ServicesLogic {
    public ServicesLogic(){}
    Donations donations=new Donations();
    LandlineServices landlineServices=new LandlineServices();

    public HashMap<String, String> GetDonationList(){
        return  donations.DonationsHS;
    }
    public HashMap<String,String> GetLandLineServicesList(){
        return landlineServices.LandLineHS;
    }

}