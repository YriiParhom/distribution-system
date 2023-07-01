package ru.parhom.distributionsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.parhom.distributionsystem.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
