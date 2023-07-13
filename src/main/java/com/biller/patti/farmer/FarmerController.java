package com.biller.patti.farmer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FarmerController {

    @Autowired
    FarmerDao farmerDao;

    @GetMapping(value = "/getByName/{firstName}")
    ResponseEntity<List<Farmer>> getFarmerByFirstName(@PathVariable String firstName){
        return ResponseEntity.ok(farmerDao.getFarmerByFirstName(firstName));
    }

    @PostMapping(value = "/saveFarmer")
    ResponseEntity<Farmer> insertFarmer(@RequestBody Farmer farmer){
        return ResponseEntity.ok(farmerDao.saveFarmer(farmer));
    }

    @GetMapping(value = "/getByLastName/{lastName}")
    ResponseEntity<List<Farmer>> getFarmerByLastName(@PathVariable String lastName){
        return ResponseEntity.ok(farmerDao.getFarmerByLastName(lastName));
    }

    @GetMapping(value = "/getById/{id}")
    ResponseEntity<Farmer> getFarmerByLastName(@PathVariable Long id){
        return ResponseEntity.ok(farmerDao.getFarmerById(id));
    }
}
