package ru.parhom.distributionsystem.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.parhom.distributionsystem.dto.RoleRequest;
import ru.parhom.distributionsystem.dto.UserRequest;
import ru.parhom.distributionsystem.entity.User;
import ru.parhom.distributionsystem.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User createUser(UserRequest userRequest, RoleRequest roleRequest) {

        User user = User.builder()
                .login(userRequest.getLogin())
                .password(passwordEncoder.encode(userRequest.getPassword()))
                .build();

        return null;
    }
}
