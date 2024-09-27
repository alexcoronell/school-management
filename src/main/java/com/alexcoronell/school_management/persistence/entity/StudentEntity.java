package com.alexcoronell.school_management.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "middle_name", length = 100)
    private String middleName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "second_last_name", length = 100)
    private String secondLastName;

    @Column(name = "document_type", nullable = false)
    private String documentType;

    @Column(name = "document_number")
    private String documentNumber;

    @Column(name = "date_of_birth", nullable = false, columnDefinition = "DATE")
    private LocalDateTime dateOfBirth;

    @Column(nullable = false)
    private String gender;

    @Column(columnDefinition = "DATE")
    private LocalDateTime enrolment;

    @Column(columnDefinition = "SMALLINT")
    private Boolean active;

    @Column(columnDefinition = "SMALLINT")
    private Boolean deleted;

    /***** RELATIONS *****/
    @OneToMany(mappedBy = "student")
    private List<StudentGuardianEntity> studentGuardian;
}
