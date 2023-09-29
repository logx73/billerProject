package com.biller.patti.metadata;

import com.biller.patti.farmer.Farmer;
import com.openapi.gen.springboot.dto.FarmerDto;
import com.openapi.gen.springboot.dto.MetadataDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MetadataMapper {
    Metadata metadataDTOToMetadata(MetadataDto metadataDto);
    MetadataDto metadatatoMetadataDTO(Metadata metadata);
    List<Metadata> metadataDTOlistToMetadatalist(List<MetadataDto> metadataDtoList);
    List<MetadataDto> metadatalistToMetadataDTOlist(List<Metadata> metadataList);
}
