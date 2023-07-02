package ru.parhom.distributionsystem.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.parhom.distributionsystem.dto.UserRequest;
import ru.parhom.distributionsystem.entity.User;
import ru.parhom.distributionsystem.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user/create")
    public ResponseEntity<User> createUser(@Valid @RequestBody UserRequest userRequest) {
        return ResponseEntity.ok().body(userService.createUser(userRequest));
    }

    @DeleteMapping("/user/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/user/find-by-login/{login}")
    public ResponseEntity<User> findUserByLogin(@PathVariable String login) {
        return ResponseEntity.ok().body(userService.findUserByLogin(login));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(userService.findAllUsers());
    }

    @PutMapping("/user/edit/{id}")
    public ResponseEntity<User> editUser(@PathVariable Long id,
                                         @Valid @RequestBody UserRequest userRequest) {
        return ResponseEntity.ok().body(userService.editUser(id, userRequest));
    }
}
