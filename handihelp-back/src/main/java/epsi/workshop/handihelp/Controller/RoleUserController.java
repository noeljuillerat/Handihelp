package epsi.workshop.handihelp.Controller;

import epsi.workshop.handihelp.Service.RoleUserService;
import epsi.workshop.handihelp.dao.entity.RoleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role-user")
public class RoleUserController {
    // Autowired
    private RoleUserService roleUserService;
    @Autowired
    public RoleUserController (RoleUserService roleUserService) {
        this.roleUserService = roleUserService;
    }

    @GetMapping("/list")
    public Iterable<RoleUser> getAllRoleUser() {
        return roleUserService.getAllRoleUser();
    }

}
