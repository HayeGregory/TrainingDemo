package be.bstorm.gha.TrainingDemo.models.entities;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Question")
public class Question extends BaseEntity<Long> {
    // Attributes
    @Column(name = "description", length = 100, nullable = false)
    private String description;

    // Liaisons
    // question 1 - 0 reponse ( proprietaire )
    @OneToOne(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private Reponse reponse;

    // Connaissance n - 1 Question
    @ManyToOne @JoinColumn(name = "knowledge_id", nullable = false)
    private Connaissance connaissance;

    // Getters - Setters
    // Constructors
    // Methods
    // Override
}
