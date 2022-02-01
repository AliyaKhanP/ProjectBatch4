package project.bfour.debtormaintenance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.bfour.debtormaintenance.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
