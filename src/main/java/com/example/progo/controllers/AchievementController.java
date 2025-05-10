package com.example.progo.controllers;

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
    private final AchievementsService achievementService;

    public AchievementController(AchievementsService service){
        achievementService = service;
    }
    
    @GetMapping("/{goalId}")
    public List<Achievement> getGoalAchievements(@PathVariable UUID goalId){
        return achievementService.findByGoalId(goalId);
    }

    @PostMapping
    public Achievement createAchievement(@RequestBody Achievement achievement){
        return achievementService.save(achievement);
    }

    @DeleteMapping("/{id}")
    public void deleteGoal(@PathVariable UUID id){
        achievementService.delete(id);
    }
    
}
