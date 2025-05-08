package com.example.progo.servicesImpl;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.progo.model.Achievement;
import com.example.progo.services.AchievementsService;
import com.example.progo.repositories.AchievementRepository;

@Service
public class AchievementsServiceImpl implements AchievementsService {
    @Autowired
    private AchievementRepository achievementRepository;

    @Override
    public List<Achievement> findByGoalId(UUID goalId) {
        return achievementRepository.findAllByGoalId(goalId);   
    }

    @Override
    public Achievement save(Achievement achievement) {
        return achievementRepository.save(achievement);
    }    
    
    @Override
    public void delete(UUID id) {
        if (!achievementRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Achievement not found");
        }
        achievementRepository.deleteById(id);
    }
}