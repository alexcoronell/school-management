package com.alexcoronell.school_management.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "period")
@Getter
@Setter
@NoArgsConstructor
public class PeriodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "school_year_id", nullable = false)
    private Integer schoolYearId;

    @Column(name = "start_time", nullable = false, columnDefinition = "DATE")
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false, columnDefinition = "DATE")

    private LocalDateTime endTime;
    private String name;

}
