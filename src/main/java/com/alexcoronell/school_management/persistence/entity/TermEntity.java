package com.alexcoronell.school_management.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "term")
@Getter
@Setter
@NoArgsConstructor
public class TermEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "school_year_id", nullable = false)
    private Integer schoolYearId;

    @Column(name = "term_number")
    private Integer term;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    /*RELATIONS*/
    @ManyToOne(targetEntity = SchoolYearEntity.class)
    @JoinColumn(name = "school_year_id", insertable = false, updatable = false)
    private SchoolYearEntity schoolYear;

    @OneToMany(targetEntity = ClassEntity.class, fetch = FetchType.LAZY, mappedBy = "term")
    private List<TermEntity> terms;

}
