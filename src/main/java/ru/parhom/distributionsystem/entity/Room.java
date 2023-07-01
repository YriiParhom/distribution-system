package ru.parhom.distributionsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int number;


    @ManyToOne
    @JoinColumn(name = "room_id")
    private Dormitory dormitory;

    private int capacity;

    private boolean isEnabled;

    private String gender;

    @OneToMany
    @JoinColumn(name = "room_id")
    private Set<Student> students = new HashSet<>();
}
