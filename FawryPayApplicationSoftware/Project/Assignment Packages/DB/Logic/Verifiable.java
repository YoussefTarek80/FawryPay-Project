package DB.Logic;

import Admin.Admin;
import DB.Model.Regestrion;
import Payment.Wallet;
import User.USER;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Verifiable { //System
    ArrayList<Regestrion> usersTable;
    public Verifiable(){
        this.usersTable=new ArrayList<>();
    }
//    HashMap<String,String> RegisteredUsers=new HashMap<>();
//    public HashMap<String, Wallet> UserWallet =new HashMap<>();
//    public HashMap<String, List<String>> UserTransactions =new HashMap<>();
    public String CheckRegisteredEMAIL(Regestrion regestrion){
        for (Regestrion regestrionDB:usersTable) {
            if(regestrionDB.getid()== regestrion.getid()){
                return "this id already exists";
            }
        }
        usersTable.add(regestrion);
        return "Added Successfully";
    }
//    public  boolean VerifyLoginUser(USER user){
//        if(this.RegisteredUsers.containsKey(user.getEmail()) &&
//                user.getPassword().equals(this.RegisteredUsers.get(user.getEmail())))
//            return true;
//        else
//            return false;
//    }
//    public  boolean VerifyLoginAdmin(Admin admin){
//        if(admin.RegisteredAdmins.containsKey(admin.getEmail())&& admin.getPassword().equals(admin.RegisteredAdmins.get(admin.getEmail())))
//            return true;
//        else
//            return false;
//    }
}
