package com.biller.patti.metadata;

import com.openapi.gen.springboot.dto.MetadataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MetadataDao {
    @Autowired
    private MetadataRepository metadataRepository;

    @Autowired
    private MetadataMapper metadataMapper;

    public MetadataDto saveBill(MetadataDto metadataDto) {
        try{
            Metadata metadata = metadataMapper.metadataDTOToMetadata(metadataDto);
            metadataRepository.save(metadata);
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        return metadataDto;
    }
}
