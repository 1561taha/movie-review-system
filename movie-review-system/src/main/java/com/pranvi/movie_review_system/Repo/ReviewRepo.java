package com.pranvi.movie_review_system.Repo;

import com.pranvi.movie_review_system.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review,Long> {
}
