package com.pranvi.movie_review_system.Controller;

import com.pranvi.movie_review_system.Model.Movie;
import com.pranvi.movie_review_system.Service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@Tag(name = "Movie_Api's", description = " this is a movie related api ")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/all")
    @Operation(summary = "get all movies ")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/upload")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }
}

