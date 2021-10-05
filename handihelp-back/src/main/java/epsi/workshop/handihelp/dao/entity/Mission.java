package epsi.workshop.handihelp.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "tbl_mission")
public class Mission {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "titre")
    private String titre;

    @Lob
    @Column(name = "description", length = 2000)
    private String description;

    @Column(name = "date_heure")
    private String dateHeure;

    @Column(name = "duree")
    private String duree;

    @Column(name = "lieu")
    private String lieu;

    // ManyToOne : nullable = false
    @ManyToOne
    @JoinColumn(name = "etablissement_id")
    private Etablissement etablissement;

    // ManyToOne nullable = false
    @ManyToOne
    @JoinColumn(name = "type_mission_id")
    private TypeMission typeMission;

    // ManyToOne nullable = false
    @ManyToOne
    @JoinColumn(name = "statut_mission_id")
    private StatutMission statutMission;

    // ManyToOne nullable = false
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "createur_id")
    private User createur;

    // ManyToOne nullable = false
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "benevole_id")
    private User benevole;

    public Mission() {
    }

    public Mission(String titre, String description, String dateHeure, String duree,
                   String lieu, Etablissement etablissement, TypeMission typeMission,
                   StatutMission statutMission, User createur, User benevole) {
        this.titre = titre;
        this.description = description;
        this.dateHeure = dateHeure;
        this.duree = duree;
        this.lieu = lieu;
        this.etablissement = etablissement;
        this.typeMission = typeMission;
        this.statutMission = statutMission;
        this.createur = createur;
        this.benevole = benevole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(String dateHeure) {
        this.dateHeure = dateHeure;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public TypeMission getTypeMission() {
        return typeMission;
    }

    public void setTypeMission(TypeMission typeMission) {
        this.typeMission = typeMission;
    }

    public StatutMission getStatutMission() {
        return statutMission;
    }

    public void setStatutMission(StatutMission statutMission) {
        this.statutMission = statutMission;
    }

    public User getCreateur() {
        return createur;
    }

    public void setCreateur(User createur) {
        this.createur = createur;
    }

    public User getBenevole() {
        return benevole;
    }

    public void setBenevole(User benevole) {
        this.benevole = benevole;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", dateHeure='" + dateHeure + '\'' +
                ", duree='" + duree + '\'' +
                ", lieu='" + lieu + '\'' +
                ", etablissement=" + etablissement +
                ", typeMission=" + typeMission +
                ", statutMission=" + statutMission +
                ", createur=" + createur +
                ", benevole=" + benevole +
                '}';
    }
}
