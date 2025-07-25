package com.example.feedback.service;

import com.example.feedback.entity.Feedback;
import java.util.List;

public interface FeedbackService {
    Feedback saveFeedback(Feedback feedback);
    List<Feedback> listFeedback();  // method name “listFeedback”
}
