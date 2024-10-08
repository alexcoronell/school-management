package com.alexcoronell.school_management.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "class")
@Getter
@Setter
@NoArgsConstructor
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "subject_id", nullable = false)
    private Integer subjectId;

    @Column(name = "teacher_id", nullable = false)
    private Integer teacherId;

    @Column(name = "term_id", nullable = false)
    private Integer termId;

    @Column(name = "start_period_id", nullable = false)
    private Integer startPeriodId;

    @Column(name = "end_period_id", nullable = false)
    private Integer endPeriodId;

    @Column(name = "classroom_id", nullable = false)
    private Integer classroomId;

    private String name;

    /*RELATIONS*/
    @ManyToOne(targetEntity = TeacherEntity.class)
    @JoinColumn(name = "teacher_id", insertable = false, updatable = false)
    private TeacherEntity teacher;

    @ManyToOne(targetEntity = TermEntity.class)
    @JoinColumn(name = "term_id", insertable = false, updatable = false)
    private TermEntity term;

    @ManyToOne(targetEntity = ClassroomEntity.class)
    @JoinColumn(name = "classroom_id", insertable = false, updatable = false)
    private ClassroomEntity classroom;

}
