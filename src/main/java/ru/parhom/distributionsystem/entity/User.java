package ru.parhom.distributionsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String password;
    // TODO: 18.06.2023 Лучше юзать енам (если состав ролей статичен). Вряд ли ты предполагаешь здесь рандомную строку
    private Role role;

    private String name;

    private String patronymic;

    private String surname;

}
