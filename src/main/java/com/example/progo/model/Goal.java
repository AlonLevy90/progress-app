package com.example.progo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.FetchType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "goals")
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    @NotNull(message = "title cannot be null")
    private String title;
    
    @Size(max = 200, message = "description cant be longer then 200 characters")
    private String description;

    @NotNull(message = "createdAt cannot be null")
    private LocalDateTime createdAt;
    
    @NotNull(message = "units cannot be null")
    private LocalDateTime updatedAt;

    @NotNull(message = "units cannot be null")
    private int units;

    @NotNull(message = "unitsMeasurement cannot be null")
    private String unitsMeasurement;

    private int unitsDone;

    @OneToMany(mappedBy = "goal", fetch = FetchType.LAZY)
    @JoinColumn(name = "achievement_id")
    private List<Achievement> achievements;
}