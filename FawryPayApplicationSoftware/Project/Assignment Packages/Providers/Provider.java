package Providers;

import DB.Logic.Verifiable;
import User.USER;

public abstract class Provider {
    public abstract void calculateServicePrice(USER user, Verifiable v, String Number, double balance, double dis);
}
