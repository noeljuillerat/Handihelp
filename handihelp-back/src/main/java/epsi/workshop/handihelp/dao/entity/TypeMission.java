package epsi.workshop.handihelp.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_type_mission")
public class TypeMission {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Lob
    @Column(name = "description", length = 1000)
    private String description;

    // One To Many
    @OneToMany(targetEntity = Mission.class, mappedBy = "typeMission", cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Mission> missions = new ArrayList<>();

    public TypeMission() {
    }

    public TypeMission(String nom, String description, List<Mission> missions) {
        this.nom = nom;
        this.description = description;
        this.missions = missions;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    @Override
    public String toString() {
        return "TypeMission{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", missions=" + missions +
                '}';
    }
}
