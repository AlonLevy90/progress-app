package com.example.progo.services;

import java.util.List;
import java.util.UUID;
import com.example.progo.model.Achievement;

public interface AchievementsService {
    List<Achievement> findByGoalId(UUID goalId);
    public Achievement save(Achievement achievement);
    public void delete(UUID id);
}
