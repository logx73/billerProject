package com.biller.patti.farmer;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Function;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Long> {
        List<Farmer> findByFirstName(String firstName);
        Farmer findByFarmerId(Long farmerId);
        List<Farmer> findByLastName(String firstName);
}
