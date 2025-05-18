package com.example.progo.repositories;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.progo.model.Goal;
/**
*  An interface representing action available on Goal resource.
*/

public interface GoalRepository extends JpaRepository<Goal, UUID> {
  /**
   * return all goals saved in repository.
   *
   * @return all goals in repository.
   */
  List<Goal> findAll();
}
