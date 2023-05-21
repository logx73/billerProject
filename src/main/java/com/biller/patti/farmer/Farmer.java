package com.biller.patti.farmer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Farmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long farmerId;
    @Column(name = "firstName")
    private String firstName;
    private String LastName;
    private String mobile;
    private String email;
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Farmer farmer = (Farmer) o;
        return farmerId != null && Objects.equals(farmerId, farmer.farmerId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
