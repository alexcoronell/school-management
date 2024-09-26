package com.alexcoronell.school_management.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student_year_level")
@Getter
@Setter
@NoArgsConstructor
public class StudentYearLevelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "level_id", nullable = false)
    private Integer levelId;

    @Column(name = "school_year_id", nullable = false)
    private Integer schoolYearId;

    private  Integer score;
}
