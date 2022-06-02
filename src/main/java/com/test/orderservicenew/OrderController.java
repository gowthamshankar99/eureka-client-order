package com.test.orderservicenew;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "order")
public class OrderController {

    @RequestMapping(value = "/order/user", method= RequestMethod.GET)
    public String userLogin() {
        return "returning data from user function";
    }
    
}
