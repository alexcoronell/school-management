package com.alexcoronell.school_management.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student_guardian")
@Getter
@Setter
@NoArgsConstructor
public class StudentGuardianEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    @ManyToOne
    @JoinColumn(name = "guardian_id")
    private GuardianEntity guardian;

    @ManyToOne
    @JoinColumn(name = "guardian_type_id")
    private GuardianTypeEntity guardianType;
}
