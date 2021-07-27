package com.example.desafioVoo.store;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Airplane {
    @Id
    @GeneratedValue
    private Long id;

    private String model;

    private BigDecimal capacity;
}
