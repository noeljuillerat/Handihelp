package epsi.workshop.handihelp.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_referent")
public class Referent {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    // ManyToOne nullable = false
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // ManyToOne nullable = false
    @ManyToOne
    @JoinColumn(name = "role_referent_id")
    private RoleReferent roleReferent;

    public Referent() {
    }

    public Referent(String nom, String prenom, String telephone, String email,
                    User user, RoleReferent roleReferent) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.user = user;
        this.roleReferent = roleReferent;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RoleReferent getRoleReferent() {
        return roleReferent;
    }

    public void setRoleReferent(RoleReferent roleReferent) {
        this.roleReferent = roleReferent;
    }

    @Override
    public String toString() {
        return "Referent{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", user=" + user +
                ", roleReferent=" + roleReferent +
                '}';
    }
}
