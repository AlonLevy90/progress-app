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

import com.example.progo.model.Achievement;
import com.example.progo.services.AchievementsService;

@RestController
@RequestMapping("/api/achievement")
public class AchievementController {
  private final AchievementsService service;

  /**
   *  creates an AchievementController that defines the http deferent routes.
   *
   * @param service helps do operations on achievements.
   */
  @SuppressFBWarnings("EI_EXPOSE_REP2")
  public AchievementController(final AchievementsService service) {
    this.service = service;
  }

  /**
   * return achievements of a specific goal by id.
   *
   * @param goalId a valid id of an existing goal.
   * 
   * @return the achievement of that specific goal or empty.
   * returns 404 if not found.
   */
  @GetMapping("/{goalId}")
  public List<Achievement> getGoalAchievements(@PathVariable final UUID goalId) {
    return service.findByGoalId(goalId);
  }

  /**
   * save a new achievement.
   *
   * @param achievement achievement to save.
   *
   * @return the saved achievement.
   */
  @PostMapping
  public Achievement createAchievement(@RequestBody final Achievement achievement) {
    return service.save(achievement);
  }

  /**
   * delete a specific achievement by id. return 404 if not found.
   *
   * @param goalId a valid id of an existing achievement.
   */
  @DeleteMapping("/{id}")
  public void deleteGoal(@PathVariable final UUID goalId) {
    service.delete(goalId);
  }
}

