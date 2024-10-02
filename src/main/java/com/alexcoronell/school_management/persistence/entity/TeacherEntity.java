package com.alexcoronell.school_management.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "teacher")
@Getter
@Setter
@NoArgsConstructor
public class TeacherEntity {

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

    @Column(length = 100)
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(length = 200)
    private String address;

    private String gender;
    private String status;

    @Column(columnDefinition = "SMALLINT")
    private Boolean active;

    @Column(columnDefinition = "SMALLINT")
    private Boolean deleted;

    /*RELATIONS*/
    @OneToMany(targetEntity = ClassEntity.class, fetch = FetchType.LAZY, mappedBy = "teacherId")
    private List<ClassEntity> classes;
}
