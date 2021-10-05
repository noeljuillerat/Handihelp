package epsi.workshop.handihelp.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_statut_mission")
public class StatutMission {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "statut")
    private String statut;
}
