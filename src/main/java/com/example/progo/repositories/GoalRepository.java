package com.example.progo.repositories;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.progo.model.Goal;

public interface GoalRepository extends JpaRepository<Goal, UUID> {
    List<Goal> findAll();
}