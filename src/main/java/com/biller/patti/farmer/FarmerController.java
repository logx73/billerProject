package com.biller.patti.farmer;

import com.openapi.gen.springboot.api.GetFarmerApi;
import com.openapi.gen.springboot.api.SaveFarmerApi;
import com.openapi.gen.springboot.dto.FarmerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@RestController
public class FarmerController implements GetFarmerApi, SaveFarmerApi {

    @Autowired
    FarmerService farmerService;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return GetFarmerApi.super.getRequest();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @Override
    public ResponseEntity<List<FarmerDto>> getFarmers(String keyword) {
        return ResponseEntity.ok(farmerService.getFarmersMatchingPattern(keyword));
    }

    @Override
    public ResponseEntity<FarmerDto> insertFarmer(FarmerDto farmerDto) {
        return ResponseEntity.ok(farmerService.saveFarmerRecord(farmerDto));
    }
}
