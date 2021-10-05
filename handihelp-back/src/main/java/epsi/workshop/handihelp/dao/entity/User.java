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

    public User() {
    }

    public User(String nom, String prenom, String username, String password,
                String email, RoleUser roleUser, List<Referent> referents,
                List<Mission> missionsCrees, List<Mission> missionsAcceptees) {
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.password = password;
        this.email = email;
        this.roleUser = roleUser;
        this.referents = referents;
        this.missionsCrees = missionsCrees;
        this.missionsAcceptees = missionsAcceptees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RoleUser getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(RoleUser roleUser) {
        this.roleUser = roleUser;
    }

    public List<Referent> getReferents() {
        return referents;
    }

    public void setReferents(List<Referent> referents) {
        this.referents = referents;
    }

    public List<Mission> getMissionsCrees() {
        return missionsCrees;
    }

    public void setMissionsCrees(List<Mission> missionsCrees) {
        this.missionsCrees = missionsCrees;
    }

    public List<Mission> getMissionsAcceptees() {
        return missionsAcceptees;
    }

    public void setMissionsAcceptees(List<Mission> missionsAcceptees) {
        this.missionsAcceptees = missionsAcceptees;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", roleUser=" + roleUser +
                ", referents=" + referents +
                ", missionsCrees=" + missionsCrees +
                ", missionsAcceptees=" + missionsAcceptees +
                '}';
    }
}
