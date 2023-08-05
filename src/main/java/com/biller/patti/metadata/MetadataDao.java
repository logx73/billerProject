package com.biller.patti.metadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MetadataDao {
    @Autowired
    private MetadataRepository metadataRepository;

    public Metadata saveBill(Metadata metadata) {
        try{
           metadataRepository.save(metadata);
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }
        return metadata;
    }
}
