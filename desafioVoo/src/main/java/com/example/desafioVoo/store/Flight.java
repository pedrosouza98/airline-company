package com.example.desafioVoo.store;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    @Id
    @GeneratedValue
    private Long id;

    private String startTime;

    private String endTime;

    private String origin;

    private String destiny;

    private List<Airplane> airplaneList;

    private List<Pilot> pilotList;

    private List<FlightStatus> flightStatusList;
}
