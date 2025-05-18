package com.example.progo.services;

import java.util.List;
import java.util.UUID;

import com.example.progo.model.Achievement;

/**
 * an interface representing all possible operation on Achievements in repository.
 */
public interface AchievementsService {
  /**
   * get all achievements of a specific goal by id.
   *
   * @param goalId a valid id of a goal.
   *
   * @return all achievements of a specific goal or 404 if not found.
   */
  List<Achievement> findByGoalId(UUID goalId);

  /**
   * save an achievement in repository.
   *
   * @param achievement a valid achievement to save.
   *
   * @return the saved achievement.
   */
  Achievement save(Achievement achievement);

  /**
   * delete an achievement.
   *
   * @param id a valid id of a specific achievement to delete.
   */
  void delete(UUID id);
}
