package com.example.progo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.progo.services.GoalService;
import com.example.progo.model.Goal;
import java.util.List;

@RestController
@RequestMapping("/api/goals")
public class GoalController {
    private final GoalService goalService;

    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @GetMapping
    public List<Goal> getAllGoals() {
        return goalService.findAll();
    }

    @PostMapping
    public Goal createGoal(@RequestBody Goal goal){
        return goalService.save(goal);
    }

    @DeleteMapping("/{id}")
    public void deleteGoal(@PathVariable UUID id){
        goalService(id);
    }
}
