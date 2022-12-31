package com.FawryprojectPay.FawryPay.Payment.Controller;

import com.FawryprojectPay.FawryPay.DB.Model.Customer;
import com.FawryprojectPay.FawryPay.Payment.Logic.PaymentLogic;
import com.FawryprojectPay.FawryPay.Payment.Model.Payment;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    private PaymentLogic paymentLogic;
    public PaymentController(PaymentLogic paymentLogic){
        this.paymentLogic = paymentLogic;
    }
    @PostMapping(value="/CreditCard")
    public String SetCreditCardInfo(@RequestBody Payment creditCard)
    {    return paymentLogic.SetCreditCardInfo(creditCard); }
    @PostMapping (value = "/AddFunds")
    public String AddFunds(@RequestParam (required = false) double Funds,
                           @RequestBody Customer User){
        return paymentLogic.AddFunds(User,Funds);
    }

//    @GetMapping(value = "/GetCreditCard/{Email}")
//    public Payment getCreditCardInfo(@PathVariable String Email)
//    {return paymentLogic.getCreditCardInfo(Email);}
}
//    @PostMapping(value="/AddFunds")
//    public String AddFunds(@RequestBody CreditCard creditCard){
//        return paymentLogic.AddFunds(creditCard);
//    }