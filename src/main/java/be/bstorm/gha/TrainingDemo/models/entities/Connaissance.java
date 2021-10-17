package be.bstorm.gha.TrainingDemo.models.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "knowledge")
public class Connaissance extends BaseEntity<Long> {

    // Attributes
    @Column(name = "id_knowledge")
    private Long id;

    @Column(name = "name", length = 50)
    private String nom;

    @Column(name = "avatar", length = 50)
    private String avatar;

    @Column(name = "type_knowledge")
    private TypeConnaissance typeConnaissance;

    @Column(name = "State_progress")
    private int etatAvancement;                 // enumeration ? pourcentage ?

    // Liaison
    // Connaissance n - 1 Question (Proprietaire)
    @OneToMany(mappedBy = "connaissance", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Question> questions;

    // utilisateur n - n connaissance
    @ManyToMany(mappedBy = "connaissances")
    private Set<Utilisateur> utilisateurs;

    // Getters - Setters
    // Constructors
    // Methods
    // Override
}
