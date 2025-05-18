package com.example.progo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "goals")
public class Goal {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @NotNull(message = "title cannot be null")
  private String title;

  @Size(max = 200, message = "description cant be longer then 200 characters")
  private String description;

  @NotNull(message = "createdAt cannot be null")
  private LocalDateTime createdAt;

  @NotNull(message = "updatedAt cannot be null")
  private LocalDateTime updatedAt;

  @NotNull(message = "units cannot be null")
  private int units;

  @NotNull(message = "unitsMeasurement cannot be null")
  private String unitsMeasurement;

  @NotNull(message = "unitsDone cannot be null")
  private int unitsDone;

  @OneToMany(mappedBy = "goal", fetch = FetchType.LAZY)
  private List<Achievement> achievements = new ArrayList<>();

  public UUID getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public int getUnits() {
    return units;
  }

  public String getUnitsMeasurement() {
    return unitsMeasurement;
  }

  public int getUnitsDone() {
    return unitsDone;
  }

  public List<Achievement> getAchievements() {
    return Collections.unmodifiableList(achievements);
  }
}
