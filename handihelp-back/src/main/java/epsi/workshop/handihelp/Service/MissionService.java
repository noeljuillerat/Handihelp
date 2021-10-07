package epsi.workshop.handihelp.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import epsi.workshop.handihelp.dao.entity.Mission;
import epsi.workshop.handihelp.dao.entity.StatutMission;
import epsi.workshop.handihelp.dao.entity.User;
import epsi.workshop.handihelp.dao.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
public class MissionService {
    // Autowired
    private final MissionRepository missionRepository;
    private final UserService userService;
    private final StatutMissionService statutMissionService;

    @Autowired
    public MissionService (MissionRepository missionRepository, UserService userService,
                           StatutMissionService statutMissionService) {
        this.missionRepository = missionRepository;
        this.userService = userService;
        this.statutMissionService = statutMissionService;
    }

    public Iterable<Mission> getAllMission() {
        return missionRepository.findAll();
    }

    @Transactional
    public void saveMission(Mission mission) {
        missionRepository.save(mission);
    }

    public String createMission(String bodyRequest) {
        try {
            JsonObject jsonMission = new Gson().fromJson(bodyRequest, JsonObject.class);
            Mission mission = new Mission();
            mission.setTitre(jsonMission.get("titre").getAsString());
            mission.setDateHeure(jsonMission.get("date").getAsString());
            mission.setLieu(jsonMission.get("lieu").getAsString());
            mission.setDuree(jsonMission.get("duree").getAsString());
            mission.setDescription(jsonMission.get("description").getAsString());
            // Get user back
            Long id = jsonMission.get("userid").getAsLong();
            User user = userService.getUserById(id);
            mission.setCreateur(user);
            // Set statut
            Iterable<StatutMission> statuts = statutMissionService.getAllStatutMission();
            for (StatutMission statut : statuts) {
                if (Objects.equals(statut.getStatut(), "DEPOSEE")) {
                    mission.setStatutMission(statut);
                }
            }
            this.saveMission(mission);
            return "{\"status\":\"ok\"}";
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"status\":\"error\"}";
        }
    }
}
