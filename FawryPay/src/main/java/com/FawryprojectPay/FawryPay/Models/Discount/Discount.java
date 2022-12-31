package com.FawryprojectPay.FawryPay.Models.Discount;

import com.FawryprojectPay.FawryPay.Models.Services.Service;

public interface Discount {
    public void registerObserver(Service o);
    public void removeObserver(Service o);
    public void notifyObservers();
}
