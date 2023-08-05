package com.biller.patti.goods;

import com.biller.patti.metadata.Metadata;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;
    private float price;
    private Double weight;
    private Double rate;
    private BigDecimal amount;
    private BigDecimal advanceAmount;
    private String checkNumber;
    private LocalDate purchased;

}
