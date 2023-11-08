package com.biller.patti.metadata;

import com.openapi.gen.springboot.api.GetMetadataApi;
import com.openapi.gen.springboot.api.SaveMetadataApi;
import com.openapi.gen.springboot.dto.MetadataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@RestController
public class MetadataController implements SaveMetadataApi, GetMetadataApi {
    @Autowired
    private MetadataService metadataService;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return SaveMetadataApi.super.getRequest();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @Override
    public ResponseEntity<MetadataDto> saveBill(MetadataDto metadataDto) {
        return ResponseEntity.ok(metadataService.saveBill(metadataDto));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @Override
    public ResponseEntity<List<MetadataDto>> getMetadata(Long farmerId) {
        return ResponseEntity.ok(metadataService.getMetadataByFarmerId(farmerId));
    }
}
