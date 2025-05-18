package com.example.progo.servicesImpl;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.progo.model.Goal;
import com.example.progo.repositories.GoalRepository;
import com.example.progo.services.GoalService;

@Service
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
    if (!goalRepository.existsById(id)) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Goal not found");
    }
    goalRepository.deleteById(id);
  }   
}
