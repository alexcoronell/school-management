package com.alexcoronell.school_management.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "school_year")
@Getter
@Setter
@NoArgsConstructor
public class SchoolYearEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    private String name;

    /*RELATIONS*/
    @OneToMany(targetEntity = TermEntity.class, fetch = FetchType.LAZY, mappedBy = "schoolYear")
    private List<TermEntity> term;
}
