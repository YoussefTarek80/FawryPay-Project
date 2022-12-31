package User;

import DB.Logic.Verifiable;

public class Transaction {
    private int TransactionNumber=1;
    private double TransacationAmount ;
    private String ServiceName;
    public void CreateTransaction(USER user, String ServName, double Amount, Verifiable V){

        if(ServName =="LandlineServices") {
            this.ServiceName = "LandlineServices";
            this.TransacationAmount = Amount;
        }
        else if (ServName .equals("Donation")) {
            this.ServiceName = "Donation";
            this.TransacationAmount = Amount;
        }
        else if (ServName.equals("InternetPaymentServices")) {
            this.ServiceName = "InternetPaymentServices";
            this.TransacationAmount = Amount;
        }
        else if (ServName.equals("MobileRechargeServices")) {
            this.ServiceName = "MobileRechargeServices";
            this.TransacationAmount = Amount;
        }
//        user.UserTransactions.add(this.toString());
        V.UserTransactions.get(user.getEmail()).add(this.toString());
//        V.UserTransactions.get(user).;
        this.TransactionNumber++;
    }
    public String toString(){
        return "["+this.TransactionNumber+"."+"ServiceName=" + this.ServiceName +" || TransctionAmount= "+this.TransacationAmount + "]\n";
    }
}
