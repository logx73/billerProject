package com.biller.patti.farmer;

//import com.openapi.gen.springboot.dto.FarmerDto;
import com.openapi.gen.springboot.dto.FarmerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerService {

    @Autowired
    FarmerDao farmerDao;

    @Autowired
    FarmerMapper farmerMapper;

    public List<FarmerDto> getFarmersMatchingPattern(String keyword) {
        List<Farmer> farmerList = farmerDao.getFarmerByParam(keyword);
        List<FarmerDto> farmerDtoslist = farmerMapper.farmerlistDTOToFarmerlist(farmerList);
        return farmerDtoslist;
    }

    public FarmerDto saveFarmerRecord(FarmerDto farmerDto){
        Farmer farmer = farmerMapper.farmerToFarmerDTO(farmerDto);
        farmerDao.saveFarmer(farmer);
        return farmerDto;
    }
}
