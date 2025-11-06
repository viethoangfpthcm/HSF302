package edu.fuhcm.lapshop.se678968.repository;

import edu.fuhcm.lapshop.se678968.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{

    User findByEmail(String email);
}
