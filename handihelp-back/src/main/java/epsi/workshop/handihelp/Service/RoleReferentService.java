package epsi.workshop.handihelp.Service;

import epsi.workshop.handihelp.dao.entity.RoleReferent;
import epsi.workshop.handihelp.dao.repository.RoleReferentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RoleReferentService {
    //Autowired
    private final RoleReferentRepository roleReferentRepository;

    @Autowired
    public RoleReferentService (RoleReferentRepository roleReferentRepository) {
        this.roleReferentRepository = roleReferentRepository;
    }

    public Iterable<RoleReferent> getAllRoleReferent() {
        return roleReferentRepository.findAll();
    }

    @Transactional
    public void saveRoleReferent(RoleReferent roleReferent) {
        roleReferentRepository.save(roleReferent);
    }
}
