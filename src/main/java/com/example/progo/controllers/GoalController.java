package com.example.progo.controllers;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.progo.model.Goal;
import com.example.progo.services.GoalService;

/**
 * REST controller for managing Goal entities.
 */
@RestController
@RequestMapping("/api/goals")
public class GoalController {

  private final GoalService goalService;

  /**
   * Constructs a new GoalController with the given GoalService.
   *
   * @param goalService the service used to handle goal operations
   */
  @SuppressFBWarnings("EI_EXPOSE_REP2")
  public GoalController(final GoalService goalService) {
    this.goalService = goalService;
  }

  /**
   * Retrieves all goals.
   *
   * @return a list of all stored Goal entities
   */
  @GetMapping
  public List<Goal> getAllGoals() {
    return goalService.findAll();
  }

  /**
   * Creates a new goal.
   *
   * @param goal the Goal entity to be created
   * @return the created Goal entity
   */
  @PostMapping
  public Goal createGoal(@RequestBody final Goal goal) {
    return goalService.save(goal);
  }

  /**
   * Deletes a goal by its ID.
   *
   * @param goalId the UUID of the Goal to be deleted
   */
  @DeleteMapping("/{id}")
  public void deleteGoal(@PathVariable final UUID goalId) {
    goalService.delete(goalId);
  }
}
