package com.biller.patti.metadata;

import com.openapi.gen.springboot.dto.MetadataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MetadataDao {
    @Autowired
    private MetadataRepository metadataRepository;

    @Autowired
    private MetadataMapper metadataMapper;

    public Metadata saveBill(Metadata metadata) {
        try{
            metadataRepository.save(metadata);
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        return metadata;
    }

    public List<Metadata> getMetadataByFarmerId(Long farmerId) {
        List<Metadata> metadataList =  new ArrayList<>();
        try{
            metadataList = metadataRepository.findMetadataByFarmerId(farmerId);
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        return metadataList;
    }
}
