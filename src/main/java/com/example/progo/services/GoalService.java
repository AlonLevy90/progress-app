package com.example.progo.services;

import java.util.List;
import java.util.UUID;

import com.example.progo.model.Goal;

public interface GoalService {
    List<Goal> findAll();
    Goal save(Goal goal);
    void delete(UUID id);
}
