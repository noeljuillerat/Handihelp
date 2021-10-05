package epsi.workshop.handihelp.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_role_referent")
public class RoleReferent {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "role")
    private String role;


}
