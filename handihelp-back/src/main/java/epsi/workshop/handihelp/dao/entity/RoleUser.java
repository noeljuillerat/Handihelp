package epsi.workshop.handihelp.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_role_user")
public class RoleUser {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "role")
    private String role;

    @OneToMany(targetEntity = User.class, mappedBy = "roleUser")
    private List<User> users = new ArrayList<>();

}
