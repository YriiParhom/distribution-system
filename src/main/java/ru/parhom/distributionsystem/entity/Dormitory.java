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
public class Dormitory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Min(1)
    private Integer number;
    private Integer numOfRooms;
    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;
    private boolean isEnable;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "dormitory_id")
    private Set<Room> rooms = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "dormitory_id")
    private Set<Student> students = new HashSet<>();
}
