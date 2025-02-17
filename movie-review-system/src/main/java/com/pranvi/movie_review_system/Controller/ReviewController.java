package com.pranvi.movie_review_system.Controller;

import com.pranvi.movie_review_system.Model.Review;
import com.pranvi.movie_review_system.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/movies/{movieId}/reviews")
    public Review addReview(@PathVariable Long movieId, @RequestBody Review review) throws ChangeSetPersister.NotFoundException {
        return reviewService.addReview(movieId, review);
    }

    @PutMapping("/reviews/{reviewId}")
    public Review updateReview(@PathVariable Long reviewId, @RequestBody Review review) throws ChangeSetPersister.NotFoundException {
        return reviewService.updateReview(reviewId, review);
    }
}

