package com.alexcoronell.school_management.persistence.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class StudentGuardianId implements Serializable {
    private Long studentId;
    private Long guardianId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentGuardianId that)) return false;
        return Objects.equals(studentId, that.studentId) && Objects.equals(guardianId, that.guardianId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, guardianId);
    }
}
