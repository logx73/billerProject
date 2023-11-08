package com.biller.patti.metadata;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MetadataRepository extends JpaRepository<Metadata, Long> {
    List<Metadata> findMetadataByFarmerId(Long farmerId);
}
