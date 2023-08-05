package com.biller.patti.metadata;

import com.biller.patti.goods.Goods;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Metadata {

    @Id
    @SequenceGenerator(name = "EntityTwoSequence", initialValue = 1000)
    @GeneratedValue(generator = "EntityTwoSequence")
    private Long metaBillId;
    private Long farmerId;
    private LocalDate lastUpdated;
    private String status;
    @OneToMany(targetEntity = Goods.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "fkid" ,referencedColumnName = "metaBillId")
    private Set<Goods> goodsList;
}
