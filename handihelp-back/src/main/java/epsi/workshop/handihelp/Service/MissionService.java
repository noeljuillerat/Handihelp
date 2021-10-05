package epsi.workshop.handihelp.Service;

import epsi.workshop.handihelp.dao.entity.Mission;
import epsi.workshop.handihelp.dao.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MissionService {
    // Autowired
    private MissionRepository missionRepository;

    @Autowired
    public MissionService (MissionRepository missionRepository) {
        this.missionRepository = missionRepository;
    }

    public Iterable<Mission> getAllMission() {
        return missionRepository.findAll();
    }

    @Transactional
    public void saveMission(Mission mission) {
        missionRepository.save(mission);
    }
}
