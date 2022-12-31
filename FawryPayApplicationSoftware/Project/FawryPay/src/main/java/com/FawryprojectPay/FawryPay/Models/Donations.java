package com.FawryprojectPay.FawryPay.Models;


import com.FawryprojectPay.FawryPay.Models.Service;


import java.util.HashMap;
import java.util.Scanner;

public class Donations implements Service {
    public HashMap<String,String>DonationsHS = new HashMap<>(3);
    public Donations(){
        DonationsHS.put("57357","Cancer Hospital ");
        DonationsHS.put("10019","Schools");
        DonationsHS.put("10020","NGO school");
    }

    @Override
    public void update(int setDiscount) {
    }
}

