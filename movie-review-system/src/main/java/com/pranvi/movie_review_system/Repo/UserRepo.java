package com.pranvi.movie_review_system.Repo;

import com.pranvi.movie_review_system.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
