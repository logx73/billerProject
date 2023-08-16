package com.biller.patti.metadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetadataController {
    @Autowired
    private MetadataDao metadataDao;

    @PostMapping("/saveMetadata")
    ResponseEntity<Metadata> saveBill(@RequestBody Metadata metadata){
        return ResponseEntity.ok(metadataDao.saveBill(metadata));
    }
}
