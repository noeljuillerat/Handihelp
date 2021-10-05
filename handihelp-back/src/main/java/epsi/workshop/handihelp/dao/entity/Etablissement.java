package epsi.workshop.handihelp.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_etablissement")
public class Etablissement {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "adresse")
    private String adresse;


}
