package ru.parhom.distributionsystem.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.parhom.distributionsystem.entity.Role;

@Getter
@Setter
@AllArgsConstructor
public class UserRequest {

    @NotBlank(message = "Login can't be empty")
    @Size(min = 5, message = "Login have to consists of at least 5 symbols")
    private String login;

    @NotBlank(message = "Password can't be empty")
    @Size(min = 5, message = "Password have to consists of at least 5 symbols")
    private String password;

    private Role role;

    @NotBlank(message = "Name required")
    @Size(min = 2, message = "Name have to consists of at least 2 symbols")
    private String name;

    private String patronymic;

    @NotBlank
    @Size(min = 2, message = "Surname have to consists of at least 2 symbols")
    private String surname;
}
