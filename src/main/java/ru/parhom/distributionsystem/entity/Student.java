package ru.parhom.distributionsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String patronymic;

    private String surname;

    private String gender;

    @ManyToOne
    private University university;

    @ManyToOne
    private Dormitory dormitory;

    @ManyToOne
    private Room room;

    private LocalDate entranceDate;

    private LocalDate expulsionDate;

    private boolean isLivingInDormitory;
}
