package ru.parhom.distributionsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(min = 3, max = 25)
    private String login;
    @Length(min = 5, max = 25)
    private String password;
    private String role;
    @Length(min = 2)
    private String name;
    private String patronymic;
    @Length(min = 2)
    private String surname;

}
