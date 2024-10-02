package com.alexcoronell.school_management.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "classroom")
@Getter
@Setter
@NoArgsConstructor
public class ClassroomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "room_type_id", nullable = false)
    private Integer roomTypeId;

    private String roomName;

    private Integer capacity;

    private String status;

    @ManyToOne(targetEntity = ClassroomTypeEntity.class)
    @JoinColumn(name = "room_type_id", insertable = false, updatable = false)
    private ClassroomTypeEntity classroomType;

}
