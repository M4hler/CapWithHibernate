package com.bayer.accrual.databroker.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(schema = "databroker")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class POAccrualDataDTO {
    @Id
    @Column
    private String OPSYS;
    @Column
    private Integer EBELN;
    @Column
    private String controller;
}
