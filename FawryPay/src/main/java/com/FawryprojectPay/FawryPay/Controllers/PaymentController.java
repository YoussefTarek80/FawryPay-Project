package com.FawryprojectPay.FawryPay.Controllers;

import com.FawryprojectPay.FawryPay.Logic.PaymentLogic;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    private PaymentLogic paymentLogic;
    public PaymentController(PaymentLogic paymentLogic){
        this.paymentLogic = paymentLogic;
    }
    @PostMapping(value="/CreditCard")
    public String SetCreditCardInfo(@RequestParam (required = false) double creditCardBalance,
                                    @RequestParam (required = false) String Email)
    {    return paymentLogic.SetCreditCardBalance(creditCardBalance,Email); }

    @PostMapping (value = "/AddFunds")
    public String AddFunds(@RequestParam (required = false) double Funds,
                           @RequestParam (required = false) String Email){
        return paymentLogic.AddFunds(Email,Funds);
    }
    @PostMapping(value="/Donation/Wallet")
    public String DonateByWallet(@RequestParam(required = false) String Email,
                                 @RequestParam(required = false) double Donation,
                                 @RequestParam(required = false) String Code)
    {
        return paymentLogic.DonateByWallet(Email,Donation,Code);
    }
    @PostMapping(value="/Donation/CreditCard")
    public String DonateByCreditCard(@RequestParam(required = false) String Email,
                                     @RequestParam(required = false) double Donation,
                                     @RequestParam(required = false) String Code )
    {
        return paymentLogic.DonateByCreditCard(Email,Donation,Code);
    }
    @PostMapping(value="/LandLineServices/Wallet/Monthly")
    public String RechargeMonthlyReceiptByWallet(@RequestParam(required = false) String Email)
    {
        return paymentLogic.RechargeMonthlyReceiptByWallet(Email);
    }
    @PostMapping(value="/LandLineServices/Wallet/Quarter")
    public String RechargeQuarterReceiptByWallet(@RequestParam(required = false) String Email)
    {
        return paymentLogic.RechargeQuarterReceiptByWallet(Email);
    }
    @PostMapping(value="/LandLineServices/CreditCard/Monthly")
    public String RechargeMonthlyReceiptByCreditCard(@RequestParam(required = false) String Email)
    {
        return paymentLogic.RechargeMonthlyReceiptByCreditCard(Email);
    }
    @PostMapping(value="/LandLineServices/CreditCard/Quarter")
    public String RechargeQuarterReceiptByCreditCard(@RequestParam(required = false) String Email)
    {
        return paymentLogic.RechargeQuarterReceiptByCreditCard(Email);
    }
    @PostMapping(value="/MobileRechargeServices/Wallet")
    public String MobileRechargeServicesByWallet(@RequestParam(required = false) String Email,
                                                 @RequestParam(required = false) String Number,
                                                 @RequestParam(required = false) String Provider,
                                                 @RequestParam(required = false) double Amount)
    {
        return paymentLogic.MobileRechargeServicesByWallet(Number,Email,Provider,Amount);
    }
    @PostMapping(value="/InternetRechargeServices/Wallet")
    public String InternetRechargeServicesByWallet(@RequestParam(required = false) String Email,
                                                 @RequestParam(required = false) String Number,
                                                 @RequestParam(required = false) String Provider,
                                                 @RequestParam(required = false) double Amount)
    {
        return paymentLogic.InternetRechargeServicesByWallet(Number,Email,Provider,Amount);
    }
}
//    @GetMapping(value = "/GetCreditCard/{Email}")
//    public Payment getCreditCardInfo(@PathVariable String Email)
//    {return paymentLogic.getCreditCardInfo(Email);}
//    @PostMapping(value="/AddFunds")
//    public String AddFunds(@RequestBody CreditCard creditCard){
//        return paymentLogic.AddFunds(creditCard);
//    }