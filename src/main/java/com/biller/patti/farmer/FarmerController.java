package com.biller.patti.farmer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmerController {

    @Autowired
    FarmerDao farmerDao;

    @RequestMapping(value = "/insert")
    void insertData(){
        farmerDao.getFarmerByFirstName();
    }
}
