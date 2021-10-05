package epsi.workshop.handihelp.Service;

import epsi.workshop.handihelp.dao.entity.RoleUser;
import epsi.workshop.handihelp.dao.repository.RoleUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RoleUserService {
    // Autowired
    private final RoleUserRepository roleUserRepository;

    @Autowired
    public RoleUserService(RoleUserRepository roleUserRepository) {
        this.roleUserRepository = roleUserRepository;
    }

    public Iterable<RoleUser> getAllRoleUser() {
        return roleUserRepository.findAll();
    }

    @Transactional
    public void saveRole(RoleUser roleUser) {
        roleUserRepository.save(roleUser);
    }

}
