package be.bstorm.gha.TrainingDemo.models.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass
public abstract class BaseEntity <TKey extends Serializable> {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected TKey id;

    @Column(name = "createdAt", nullable = false)
    protected LocalDate dateCreation;

    @Column(name = "updatedAt", nullable = true)
    protected LocalDate dateModification;

    // Getters - Setters
    public TKey getId() {
        return id;
    }
    public void setId(TKey id) {
        this.id = id;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDate getDateModification() {
        return dateModification;
    }
    public void setDateModification(LocalDate dateModification) {
        this.dateModification = dateModification;
    }
}
