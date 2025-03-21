package com.Project_2_Location_Status_API.Entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name= "StatusReport")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class StatusReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="id", columnDefinition = "AUTO_INCREMENT")
    private int id;

    @Column(name = "score")
    private double score;

    @Column(name = "location")
    private String location;

    @Column(name = "creationDate")
    private LocalDate creationDate;

    @Column(name = "locationStatus")
    private String status;

}
