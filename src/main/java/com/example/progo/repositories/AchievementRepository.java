package com.example.progo.repositories;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.progo.model.Achievement;

public interface AchievementRepository extends JpaRepository<Achievement, UUID> {
    List<Achievement> findAllByGoalId(UUID goalId);
}