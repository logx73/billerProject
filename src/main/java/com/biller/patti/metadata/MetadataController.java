package com.biller.patti.metadata;

import com.openapi.gen.springboot.api.SaveMetadataApi;
import com.openapi.gen.springboot.dto.MetadataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MetadataController implements SaveMetadataApi {
    @Autowired
    private MetadataDao metadataDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @Override
    public ResponseEntity<MetadataDto> saveBill(MetadataDto metadataDto) {
        return ResponseEntity.ok(metadataDao.saveBill(metadataDto));
    }
}
