package com.example.feedback.controller;

import com.example.feedback.entity.Feedback;
import com.example.feedback.service.FeedbackService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    private final FeedbackService service;

    public FeedbackController(FeedbackService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Feedback addFeedback(@Valid @RequestBody Feedback feedback) {
        return service.saveFeedback(feedback);
    }

    @GetMapping
    public List<Feedback> allFeedback() {
        return service.listFeedback();  // matches service
    }
}
