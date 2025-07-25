package com.example.feedback.repository;

import com.example.feedback.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepo extends JpaRepository<Feedback, Long> {
    // no extra methods, simple CRUD
}
