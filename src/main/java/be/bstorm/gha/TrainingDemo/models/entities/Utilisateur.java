package be.bstorm.gha.TrainingDemo.models.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity(name="user")
public class Utilisateur extends BaseEntity<Long>{

    // Attributes
    @Column(name = "id_user")
    protected Long id;

    @Column(name="lastname", length = 50, nullable = false)
    private String nom;

    @Column(name="firstname",length = 50, nullable = false)
    private String prenom;

    @Column(name="street", length = 50, nullable = false)
    private String rue;

    @Column(name = "num", length = 5, nullable = false)
    private String numero;

    @Column(name="zipCode", length = 5, nullable = false)
    private String codePostal;

    @Column(name = "city", length = 50, nullable = false)
    private String ville;

    @Column(name="login", length = 50, unique = true, nullable = false)
    private String login;

    @Column(name = "password", length = 20, nullable = false)
    private String motDePasse;

    @Column(name = "avatar", length = 50, nullable = true)
    private String avatar;

    @Column(name="birthdate", nullable = false)
    private LocalDate dateNaissance;

    // liaison
    // utilisateur n - n connaissance ( proprietaire )
    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable(
            name="User_knowledge",
            joinColumns = { @JoinColumn(name = "id_user") },
            inverseJoinColumns = {@JoinColumn(name = "id_knowledge")}
    )
    private Set<Connaissance> connaissances;

    // Getters - Setters
    // Constructors
    // Methods
    // Override
}
