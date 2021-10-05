package epsi.workshop.handihelp.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_statut_mission")
public class StatutMission {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "statut")
    private String statut;

    // One To Many
    @JsonIgnore
    @OneToMany(targetEntity = Mission.class, mappedBy = "statutMission", cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Mission> missions = new ArrayList<>();

    public StatutMission() {
    }

    public StatutMission(String statut, List<Mission> missions) {
        this.statut = statut;
        this.missions = missions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    @Override
    public String toString() {
        return "StatutMission{" +
                "id=" + id +
                ", statut='" + statut + '\'' +
                ", missions=" + missions +
                '}';
    }
}
