package com.biller.patti.farmer;

import com.openapi.gen.springboot.dto.FarmerDto;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface FarmerMapper {
    Farmer farmerToFarmerDTO(FarmerDto farmerDto);
    FarmerDto farmerDTOtoFarmer(Farmer farmer);
    List<Farmer> farmerlistTofarmerlistDTO(List<FarmerDto> farmerDto);
    List<FarmerDto> farmerlistDTOToFarmerlist(List<Farmer> farmer);
}
