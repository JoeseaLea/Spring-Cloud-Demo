package com.joesea.service.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>@author : Joesea Lea</p>
 * <p>@date : 2020/2/18</p>
 * <p>@description : </p>
 */
@RestController
@RequestMapping(value = "serviceCustomer")
public class ServiceCustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "test")
    public Object test() {
        return restTemplate.getForObject("http://provider/serviceProvider/getJsonResult", Object.class);
    }
}
