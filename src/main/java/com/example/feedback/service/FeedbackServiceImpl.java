package com.example.feedback.service;

import com.example.feedback.entity.Feedback;
import com.example.feedback.repository.FeedbackRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackRepo repo;

    public FeedbackServiceImpl(FeedbackRepo repo) {
        this.repo = repo;
    }

    @Override
    public Feedback saveFeedback(Feedback feedback) {
        return repo.save(feedback);
    }

    @Override
    public List<Feedback> listFeedback() {
        return repo.findAll();   // findAll returns List<Feedback>
    }
}
