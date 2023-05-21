package com.biller.patti.metadata;

import com.biller.patti.goods.Goods;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Metadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;
    private Long farmerId;
    private LocalDate lastUpdated;
    private String status;
    @OneToMany(mappedBy = "metadata", cascade = CascadeType.ALL)
    private List<Goods> goodsList;
}
