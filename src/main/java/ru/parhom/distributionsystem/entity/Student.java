package ru.parhom.distributionsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
// TODO: 18.06.2023 не советую увлекаться кастомизацией стандартных аннотаций. 1 - это незаметно, 2 - не понимаю, зачем это здесь
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // TODO: 18.06.2023 зачем  NonNull? конструктор подгоняешь под ожидания?) это, чуть что, ломбоковская аннотация,
    //  валидатор - NotNull (для строк обычно - NotEmpty или NotBlank)
    private String name;

    private String patronymic;

    private String surname;

    private String gender;
    @ManyToOne //todo: потерял пустую строку:)
    private University university;

    @ManyToOne
    private Dormitory dormitory;

    @ManyToOne
    private Room room;

    private LocalDate entranceDate;

    private LocalDate expulsionDate;

    private boolean isLivingInDormitory;
}
