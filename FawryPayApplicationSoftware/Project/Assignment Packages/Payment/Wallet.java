package Payment;

public class Wallet implements Payment{
    private double BalanceWallet=0.0;
    public void setBalanceWallet(double balanceWallet) {
        this.BalanceWallet = balanceWallet;
    }
    public void SetFunds(double Funds){
        double B = this.BalanceWallet;
        B = B + Funds;
        this.setBalanceWallet(B);
    }
    public double getBalanceWallet(){
        return BalanceWallet;
    }
    @Override
    public boolean pay(double amount,double discount) {
        amount -= (amount *(discount/100.0));
        if(amount > this.BalanceWallet)
            return false;
        else{
            double D = this.BalanceWallet - amount;
            this.setBalanceWallet(D);
            return true;
        }
    }
    public boolean pay(double amount) {
        if(amount > this.BalanceWallet)
            return false;
        else{
            double D = this.BalanceWallet - amount;
            this.setBalanceWallet(D);
            return true;
        }
    }
}
