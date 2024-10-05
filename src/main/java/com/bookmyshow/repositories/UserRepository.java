package com.bookmyshow.repositories;

import com.bookmyshow.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
