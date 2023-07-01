package ru.parhom.distributionsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String universityName;

    private int duration;

    @OneToMany
    @JoinColumn(name = "university_id")
    private Set<Dormitory> dormitories = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "university_id")
    private Set<Student> students = new HashSet<>();
}
