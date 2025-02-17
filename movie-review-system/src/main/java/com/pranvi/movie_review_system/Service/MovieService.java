package com.pranvi.movie_review_system.Service;

import com.pranvi.movie_review_system.Model.Movie;
import com.pranvi.movie_review_system.Repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MovieService {
    @Autowired
    private MovieRepo movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}

