package com.biller.patti.farmer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Long> {
        List<Farmer> findByFirstName(String firstName);
        Farmer findByFarmerId(Long farmerId);
        List<Farmer> findByLastName(String firstName);

        @Query(value = "SELECT * FROM biller.farmer WHERE farmerId = :keyword OR address = :keyword OR email = :keyword OR firstName = :keyword OR lastName = :keyword",nativeQuery = true)
        List<Farmer> findByKeyword(@Param("keyword") String keyword);
}
