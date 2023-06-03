package ru.parhom.distributionsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @Length(min = 1)
    private String name;
    private String patronymic;
    @NonNull
    @Length(min = 2)
    private String surname;
    @NonNull
    private String gender;
    @ManyToOne
    private University university;
    @ManyToOne
    private Dormitory dormitory;
    @ManyToOne
    private Room room;
    @NonNull
    private LocalDate entranceDate;
    @NonNull
    private LocalDate expulsionDate;
    private boolean isLivingInDormitory;
}
