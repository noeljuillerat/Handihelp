package epsi.workshop.handihelp.Controller;

import epsi.workshop.handihelp.Service.MissionService;
import epsi.workshop.handihelp.dao.entity.Mission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/mission")
public class MissionController {
    //Autowired
    private MissionService missionService;

    @Autowired
    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @GetMapping("/list")
    public Iterable<Mission> getAllMissions() {
        return missionService.getAllMission();
    }
}
