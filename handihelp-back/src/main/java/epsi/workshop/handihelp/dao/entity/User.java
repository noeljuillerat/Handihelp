package epsi.workshop.handihelp.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    // many to one
    @ManyToOne
    @JoinColumn(name = "role_user_id", nullable = false)
    private RoleUser roleUser;

    // One to many
    @OneToMany(targetEntity = Referent.class, mappedBy = "user", cascade = CascadeType.ALL)
    private List<Referent> referents = new ArrayList<>();

    // One To Many
    @OneToMany(targetEntity = Mission.class, mappedBy = "createur", cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Mission> missionsCrees = new ArrayList<>();

    // One to Many
    @OneToMany(targetEntity = Mission.class, mappedBy = "benevole", cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Mission> missionsAcceptees = new ArrayList<>();
}
