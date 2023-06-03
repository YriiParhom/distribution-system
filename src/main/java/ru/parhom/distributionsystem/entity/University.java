package ru.parhom.distributionsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(min = 2)
    private String universityName;
    @Min(1)
    private int duration;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "university_id")
    private Set<Dormitory> dormitories = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "university_id")
    private Set<Student> students = new HashSet<>();
}
