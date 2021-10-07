package epsi.workshop.handihelp.Service;

import epsi.workshop.handihelp.dao.entity.StatutMission;
import epsi.workshop.handihelp.dao.repository.StatutMissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class StatutMissionService {
    //Autowired
    private final StatutMissionRepository statutMissionRepository;

    @Autowired
    public StatutMissionService(StatutMissionRepository statutMissionRepository) {
        this.statutMissionRepository = statutMissionRepository;
    }

    public Iterable<StatutMission> getAllStatutMission() {
        return statutMissionRepository.findAll();
    }
    public StatutMission getStatutById(Long id) {
        return statutMissionRepository.findById(id).orElseThrow();
    }
    @Transactional
    public void saveStatutMission(StatutMission statutMission) {
        statutMissionRepository.save(statutMission);
    }

}
