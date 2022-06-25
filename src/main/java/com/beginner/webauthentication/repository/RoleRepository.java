package com.beginner.webauthentication.repository;

import com.beginner.webauthentication.models.ERole;
import com.beginner.webauthentication.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole role);
}
