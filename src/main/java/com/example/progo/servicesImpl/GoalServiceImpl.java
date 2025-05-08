package com.example.progo.servicesImpl;
import com.example.progo.model.Goal;
import com.example.progo.repositories.GoalRepository;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.progo.services.GoalService;

public class GoalServiceImpl implements GoalService {
    @Autowired
    private GoalRepository goalRepository;

    @Override
    public List<Goal> findAll() {
        return goalRepository.findAll();
    }

    @Override
    public Goal save(Goal goal) {
        return goalRepository.save(goal);
    }

    @Override
    public void delete(UUID id) {
        goalRepository.deleteById(id);
    }   
}