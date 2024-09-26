package com.alexcoronell.school_management.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "year_level")
@Getter
@Setter
@NoArgsConstructor
public class YearLevelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "level_name", nullable = false, length = 50)
    private String levelName;

    @Column(name = "level_order", nullable = false)
    private Integer levelOrder;
}
