package com.biller.patti.metadata;

import com.openapi.gen.springboot.dto.MetadataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MetadataService {
    @Autowired
    private MetadataMapper metadataMapper;

    @Autowired
    private MetadataDao metadataDao;


    public List<MetadataDto> getMetadataByFarmerId(Long farmerId) {
        List<Metadata> metadataList = metadataDao.getMetadataByFarmerId(farmerId);
        Collections.reverse(metadataList);
        return metadataMapper.metadatalistToMetadataDTOlist(metadataList);
    }

    public MetadataDto saveBill(MetadataDto metadataDto) {
        Metadata metadata = metadataMapper.metadataDTOToMetadata(metadataDto);
        metadataDao.saveBill(metadata);
        return metadataMapper.metadatatoMetadataDTO(metadata);
    }
}
