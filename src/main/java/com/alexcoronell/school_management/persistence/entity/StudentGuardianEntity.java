
package com.alexcoronell.school_management.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student_guardian")
@IdClass(StudentGuardianId.class)
@Getter
@Setter
@NoArgsConstructor
public class StudentGuardianEntity {

    @Id
    @Column(name = "student_id", nullable = false)
    private Long studentId;

    @Id
    @Column(name = "guardian_id", nullable = false)
    private Long guardianId;

    @ManyToOne(targetEntity = StudentEntity.class)
    @MapsId("studentId")
    @JoinColumn(name = "student_id", referencedColumnName = "id", insertable = false, updatable = false)
    private StudentEntity student;

    @ManyToOne(targetEntity = GuardianEntity.class)
    @MapsId("guardianId")
    @JoinColumn(name = "guardian_id", referencedColumnName = "id", insertable = false, updatable = false)
    private GuardianEntity guardian;

    @ManyToOne(targetEntity = GuardianTypeEntity.class)
    @JoinColumn(name = "guardian_type_id", referencedColumnName = "id", insertable = false, updatable = false)
    private GuardianTypeEntity guardianType;
}
