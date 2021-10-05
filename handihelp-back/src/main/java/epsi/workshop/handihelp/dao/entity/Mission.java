package epsi.workshop.handihelp.dao.entity;

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

    // ManyToOne
    @Column(name = "etablissement")
    private Etablissement etablissement;

    // ManyToOne
    @Column(name = "type_mission")
    private TypeMission typeMission;

    // ManyToOne
    @Column(name = "statut_mission")
    private StatutMission statutMission;

    // ManyToOne
    @Column(name = "createur")
    private User createur;

    // ManyToOne
    @Column(name = "benevole")
    private User benevole;

}
