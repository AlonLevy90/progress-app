package com.example.progo.services;

import java.util.List;
import java.util.UUID;

import com.example.progo.model.Goal;

/**
 * an interface representing all available operation on the goals saved in the repository.
 */

public interface GoalService {
  /**
   * get all goals.
   *
   * @return all goals or empty.
   */
  List<Goal> findAll();

  /**
   * save a goal.
   *
   * @param goal the goal to save.
   *
   * @return the save goal.
   */
  Goal save(Goal goal);

  /**
   * delete a specific goal by id.
   *
   * @param id the id of the goal to delete. return 404 if not found.
   */
  void delete(UUID id);
}
