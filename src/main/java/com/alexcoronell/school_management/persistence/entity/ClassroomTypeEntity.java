package com.alexcoronell.school_management.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "classroom_type")
@Getter
@Setter
@NoArgsConstructor
public class ClassroomTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(targetEntity = ClassroomEntity.class, fetch = FetchType.LAZY, mappedBy = "classroomType")
    private List<ClassroomEntity> classrooms;
}
