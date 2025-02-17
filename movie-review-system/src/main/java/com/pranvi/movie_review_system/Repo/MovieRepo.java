package com.pranvi.movie_review_system.Repo;

import com.pranvi.movie_review_system.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie,Long> {
}
