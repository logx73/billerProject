package com.biller.patti.farmer;

import com.openapi.gen.springboot.api.GetFarmerApi;
import com.openapi.gen.springboot.dto.FarmerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FarmerController implements GetFarmerApi {

    @Autowired
    FarmerService farmerService;

    @CrossOrigin(origins = "http://localhost:4200")
    @Override
    public ResponseEntity<List<FarmerDto>> getFarmers(String keyword) {
        return ResponseEntity.ok(farmerService.getFarmersMatchingPattern(keyword));
    }
}
