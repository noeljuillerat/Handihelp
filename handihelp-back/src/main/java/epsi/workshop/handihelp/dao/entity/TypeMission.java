package epsi.workshop.handihelp.dao.entity;

import javax.persistence.*;

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

}
