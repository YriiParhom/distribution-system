package ru.parhom.distributionsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Dormitory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer number;

    private Integer numOfRooms;

    @ManyToOne
    @JoinColumn(name = "univesity_id")
    private University university;

    private boolean isEnable;

    @OneToMany
    @JoinColumn(name = "dormitory_id")
    private Set<Room> rooms = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "dormitory_id")
    private Set<Student> students = new HashSet<>();
}
