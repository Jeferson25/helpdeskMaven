package com.jefersontecnologia.helpdesk.repositories;

import com.jefersontecnologia.helpdesk.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
