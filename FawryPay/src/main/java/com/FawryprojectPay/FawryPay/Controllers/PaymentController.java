package com.FawryprojectPay.FawryPay.Controllers;

import com.FawryprojectPay.FawryPay.Logic.PaymentLogic;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private PaymentLogic paymentLogic;
    public PaymentController(PaymentLogic paymentLogic){
        this.paymentLogic = paymentLogic;
    }
    @PostMapping(value="/CreditCard")
    public String SetCreditCardInfo(@RequestParam (required = false) double creditCardBalance,
                                    @RequestParam (required = false) String Email,
                                    @RequestParam (required = false) String Password)
    {    return paymentLogic.SetCreditCardBalance(creditCardBalance,Email,Password); }

    @PostMapping (value = "/AddFunds")
    public String AddFunds(@RequestParam (required = false) double Funds,
                           @RequestParam (required = false) String Email,
                           @RequestParam (required = false) String Password){
        return paymentLogic.AddFunds(Email,Funds,Password);
    }
    @PostMapping(value="/Donation/Wallet")
    public String DonateByWallet(@RequestParam(required = false) String Email,
                                 @RequestParam(required = false) double Donation,
                                 @RequestParam(required = false) String Code,
                                 @RequestParam(required = false) String Password)
    {
        return paymentLogic.DonateByWallet(Email,Donation,Code,Password);
    }
    @PostMapping(value="/Donation/CreditCard")
    public String DonateByCreditCard(@RequestParam(required = false) String Email,
                                     @RequestParam(required = false) double Donation,
                                     @RequestParam(required = false) String Code ,
                                     @RequestParam(required = false) String Password)
    {
        return paymentLogic.DonateByCreditCard(Email,Donation,Code,Password);
    }
    @PostMapping(value="/Donation/Cash")
    public String DonateByCash(@RequestParam(required = false) String Email,
                               @RequestParam(required = false) double Donation,
                               @RequestParam(required = false) String Code ,
                               @RequestParam(required = false) String Password)
    {
        return paymentLogic.DonateByCash(Email,Donation,Code,Password);
    }
    @PostMapping(value="/LandLineServices/Wallet/Monthly")
    public String RechargeMonthlyReceiptByWallet(@RequestParam(required = false) String Email,
                                                 @RequestParam(required = false) String Password)
    {
        return paymentLogic.RechargeMonthlyReceiptByWallet(Email,Password);
    }
    @PostMapping(value="/LandLineServices/Wallet/Quarter")
    public String RechargeQuarterReceiptByWallet(@RequestParam(required = false) String Email,
                                                 @RequestParam(required = false) String Password)
    {
        return paymentLogic.RechargeQuarterReceiptByWallet(Email,Password);
    }
    @PostMapping(value="/LandLineServices/CreditCard/Monthly")
    public String RechargeMonthlyReceiptByCreditCard(@RequestParam(required = false) String Email,
                                                     @RequestParam(required = false) String Password)
    {
        return paymentLogic.RechargeMonthlyReceiptByCreditCard(Email,Password);
    }
    @PostMapping(value="/LandLineServices/CreditCard/Quarter")
    public String RechargeQuarterReceiptByCreditCard(@RequestParam(required = false) String Email,
                                                     @RequestParam(required = false) String Password)
    {
        return paymentLogic.RechargeQuarterReceiptByCreditCard(Email,Password);
    }
    @PostMapping(value="/LandLineServices/Cash/Monthly")
    public String RechargeMonthlyReceiptByCash(@RequestParam(required = false) String Email,
                                               @RequestParam(required = false) String Password)
    {
        return paymentLogic.RechargeMonthlyReceiptByCash(Email,Password);
    }
    @PostMapping(value="/LandLineServices/Cash/Quarter")
    public String RechargeQuarterReceiptByCash(@RequestParam(required = false) String Email,
                                               @RequestParam(required = false) String Password)
    {
        return paymentLogic.RechargeQuarterReceiptByCash(Email,Password);
    }
    @PostMapping(value="/MobileRechargeServices/{PayMethod}")
    public String MobileRechargeServices(@RequestParam(required = false) String Email,
                                                 @RequestParam(required = false) String Number,
                                                 @RequestParam(required = false) String Provider,
                                                 @RequestParam(required = false) double Amount,
                                                 @RequestParam(required = false) String Password,
                                                 @PathVariable("PayMethod")String PayMethod)
    {
        return paymentLogic.MobileRechargeServices(Number,Email,Provider,Amount,PayMethod,Password);
    }
    @PostMapping(value="/InternetRechargeServices/{PayMethod}")
    public String InternetRechargeServices(@RequestParam(required = false) String Email,
                                                   @RequestParam(required = false) String Number,
                                                   @RequestParam(required = false) String Provider,
                                                   @RequestParam(required = false) double Amount,
                                                   @RequestParam(required = false) String Password,
                                                   @PathVariable("PayMethod")String PayMethod)
    {
        return paymentLogic.InternetRechargeServices(Number,Email,Provider,Amount,PayMethod,Password);
    }
}