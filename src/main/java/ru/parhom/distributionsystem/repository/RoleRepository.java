package ru.parhom.distributionsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.parhom.distributionsystem.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
