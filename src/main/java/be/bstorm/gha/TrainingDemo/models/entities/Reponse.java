package be.bstorm.gha.TrainingDemo.models.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Answer")
public class Reponse extends BaseEntity<Long> {

    @Column(name = "description", length = 100, nullable = false)
    private String description;

    // Liaison question 1 - 0 reponse
    @OneToOne @JoinColumn(name="question_id", nullable = true)
    private Question question;

    // Getters - Setters
    // Constructors
    // Methods
    // Override


}
