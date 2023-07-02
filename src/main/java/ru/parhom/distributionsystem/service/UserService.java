package ru.parhom.distributionsystem.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.parhom.distributionsystem.dto.UserRequest;
import ru.parhom.distributionsystem.entity.Role;
import ru.parhom.distributionsystem.entity.User;
import ru.parhom.distributionsystem.repository.RoleRepository;
import ru.parhom.distributionsystem.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public User createUser(UserRequest userRequest) {

        User user = User.builder()
                .login(userRequest.getLogin())
                .password(passwordEncoder.encode(userRequest.getPassword()))
                .role(getRoleById(userRequest.getRoleId()))
                .name(userRequest.getName())
                .patronymic(userRequest.getPatronymic())
                .surname(userRequest.getSurname())
                .build();

        return userRepository.save(user);
    }

    public Role getRoleById(Long id) {

        Optional<Role> roleOptional = roleRepository.findById(id);

        return roleOptional.orElseThrow();
    }

    public void deleteUser(Long id) {

        userRepository.deleteById(id);
    }

    public User findUserByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User editUser(Long id, UserRequest userRequest) {

        Optional<User> userOptional = userRepository.findById(id);

        User user = userOptional.orElseThrow();

        user = User.builder()
                .login(userRequest.getLogin())
                .password(passwordEncoder.encode(userRequest.getPassword()))
                .role(getRoleById(userRequest.getRoleId()))
                .name(userRequest.getName())
                .patronymic(userRequest.getPatronymic())
                .surname(userRequest.getSurname())
                .build();

        return userRepository.save(user);
    }
}
