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
// TODO: 18.06.2023 не советую увлекаться кастомизацией стандартных аннотаций. 1 - это незаметно, 2 - не понимаю, зачем это здесь
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // TODO: 18.06.2023 зачем  NonNull? конструктор подгоняешь под ожидания?) это, чуть что, ломбоковская аннотация,
    //  валидатор - NotNull (для строк обычно - NotEmpty или NotBlank)
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
