package Discount;

import Services.Service;

public interface Discount {
    public void registerObserver(Service o);
    public void removeObserver(Service o);
    public void notifyObservers();
}
