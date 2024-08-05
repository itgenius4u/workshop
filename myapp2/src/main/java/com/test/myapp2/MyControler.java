package com.test.myapp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyControler {
    @Autowired
    Address address;
    @Autowired
    Employee employee;

    @GetMapping("/msg")
    public String getMyService() {
        address.setLocation("서울");
        employee.setName("Dennis");
        return employee.getAddress().getLocation();

    }
}
