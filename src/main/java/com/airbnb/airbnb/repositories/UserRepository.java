package com.airbnb.airbnb.repositories;

import com.airbnb.airbnb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
