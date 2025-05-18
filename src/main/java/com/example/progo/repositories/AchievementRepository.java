package com.example.progo.repositories;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.progo.model.Achievement;
/**
 * interface representing available operation on achievements in repository .
 */

public interface AchievementRepository extends JpaRepository<Achievement, UUID> {
  /**
   * get all achievements of a goal.
   *
   * @param goalId an id of a specific goal that exists in a repo otherwise return 404. 
   *
   * @return all achievements of a goal.
   */
  List<Achievement> findAllByGoalId(UUID goalId);
}
