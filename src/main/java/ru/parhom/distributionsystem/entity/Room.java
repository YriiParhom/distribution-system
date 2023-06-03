package ru.parhom.distributionsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Min(1)
    private int number;
    @ManyToOne
    private Dormitory dormitory;
    private int capacity;
    private boolean isEnabled;
    private String gender;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id")
    private Set<Student> students = new HashSet<>();
}
