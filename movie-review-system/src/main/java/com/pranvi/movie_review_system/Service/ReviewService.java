package com.pranvi.movie_review_system.Service;

import com.pranvi.movie_review_system.Model.Movie;
import com.pranvi.movie_review_system.Model.Review;
import com.pranvi.movie_review_system.Repo.MovieRepo;
import com.pranvi.movie_review_system.Repo.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepo reviewRepository;

    @Autowired
    private MovieRepo movieRepository;

    public Review addReview(Long movieId, Review review) throws ChangeSetPersister.NotFoundException {
        Movie movie = movieRepository.findById(movieId)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);
        review.setMovie(movie);
        return reviewRepository.save(review);
    }

    public Review updateReview(Long reviewId, Review updatedReview) throws ChangeSetPersister.NotFoundException {
        Review review = reviewRepository.findById(reviewId)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);
        review.setComment(updatedReview.getComment());
        review.setRating(updatedReview.getRating());
        return reviewRepository.save(review);
    }
}

