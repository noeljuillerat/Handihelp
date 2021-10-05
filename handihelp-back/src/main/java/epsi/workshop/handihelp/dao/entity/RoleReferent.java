package epsi.workshop.handihelp.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_role_referent")
public class RoleReferent {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "role")
    private String role;

    // One to Many
    @OneToMany(targetEntity = Referent.class, mappedBy = "roleReferent", cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Referent> referents = new ArrayList<>();

    public RoleReferent() {
    }

    public RoleReferent(String role, List<Referent> referents) {
        this.role = role;
        this.referents = referents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Referent> getReferents() {
        return referents;
    }

    public void setReferents(List<Referent> referents) {
        this.referents = referents;
    }

    @Override
    public String toString() {
        return "RoleReferent{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", referents=" + referents +
                '}';
    }
}
