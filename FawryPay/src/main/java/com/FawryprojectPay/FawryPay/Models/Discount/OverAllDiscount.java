package com.FawryprojectPay.FawryPay.Models.Discount;

import com.FawryprojectPay.FawryPay.Models.Services.Service;

import java.util.ArrayList;

public class OverAllDiscount implements Discount {
    private ArrayList observers;
    int SetDiscount = 0;
    public OverAllDiscount() {
        observers = new ArrayList();
    }
    public void registerObserver(Service o) {
        observers.add(o);
    }
    public void removeObserver(Service o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Service observer = (Service) observers.get(i);
            observer.update(SetDiscount);
        }
    }
    public void measurementsChanged() {
        notifyObservers();
    }
    public void setMeasurements(int SetDiscount) {
        this.SetDiscount = SetDiscount;
        measurementsChanged();
    }
}
