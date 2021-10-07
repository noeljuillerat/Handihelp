package epsi.workshop.handihelp;

import epsi.workshop.handihelp.Service.*;
import epsi.workshop.handihelp.dao.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MainService {
    // Autowired
    private final UserService userService;
    private final RoleUserService roleUserService;
    private final EtablissementService etablissementService;
    private final RoleReferentService roleReferentService;
    private final StatutMissionService statutMissionService;
    private final MissionService missionService;

    @Autowired
    public MainService(UserService userService, RoleUserService roleUserService,
                       EtablissementService etablissementService, RoleReferentService roleReferentService,
                       StatutMissionService statutMissionService, MissionService missionService) {
        this.userService = userService;
        this.roleUserService = roleUserService;
        this.etablissementService = etablissementService;
        this.roleReferentService = roleReferentService;
        this.statutMissionService = statutMissionService;
        this.missionService = missionService;
    }
    @Transactional
    public String loadData() {
        // USER ROLES
        RoleUser roleUser1 = new RoleUser();
        roleUser1.setRole("APPRENANT"); //TODO : renommer
        RoleUser roleUser2 = new RoleUser();
        roleUser2.setRole("BENEVOLE");
        roleUserService.saveRole(roleUser1);
        roleUserService.saveRole(roleUser2);

        // ROLE REFERENT
        RoleReferent roleReferent1 = new RoleReferent();
        roleReferent1.setRole("FAMILLE");
        RoleReferent roleReferent2 = new RoleReferent();
        roleReferent2.setRole("TUTEUR");
        RoleReferent roleReferent3 = new RoleReferent();
        roleReferent3.setRole("MANAGER");
        roleReferentService.saveRoleReferent(roleReferent1);
        roleReferentService.saveRoleReferent(roleReferent2);
        roleReferentService.saveRoleReferent(roleReferent3);

        // ETABLISSEMENTS
        Etablissement etablissement1 = new Etablissement();
        etablissement1.setNom("EPSI");
        etablissement1.setAdresse("437 Av. des Apothicaires, 34090 Montpellier");
        etablissementService.saveEtablissement(etablissement1);

        Etablissement etablissement2 = new Etablissement();
        etablissement2.setNom("CNAM");
        etablissement2.setAdresse("989 Rue de la Croix Verte, 34090 Montpellier");
        etablissementService.saveEtablissement(etablissement2);

        // STATUTS MISSION
        StatutMission statutMission1 = new StatutMission();
        statutMission1.setStatut("DEPOSEE");
        StatutMission statutMission2 = new StatutMission();
        statutMission2.setStatut("EN_COURS");
        StatutMission statutMission3 = new StatutMission();
        statutMission3.setStatut("TERMINEE");
        statutMissionService.saveStatutMission(statutMission1);
        statutMissionService.saveStatutMission(statutMission2);
        statutMissionService.saveStatutMission(statutMission3);

        // USER 1
        User user1 = new User();
        user1.setNom("Sylvie");
        user1.setPrenom("Dubois");
        user1.setRoleUser(roleUser1);
        userService.saveUser(user1);

        // USER 2
        User user2 = new User();
        user2.setNom("Julien");
        user2.setPrenom("Laville");
        user2.setRoleUser(roleUser2);
        userService.saveUser(user2);

        // MISSIONS
        Mission mission1 = new Mission();
        mission1.setCreateur(user1);
        mission1.setBenevole(user2);
        mission1.setTitre("Prise de notes");
        mission1.setDateHeure("Le 07 Octobre 2021 à 14h00");
        mission1.setDuree("1H");
        mission1.setLieu("Cours de C#");
        mission1.setEtablissement(etablissement1);
        mission1.setDescription("J'ai besoin d'aide pour la prise de notes pendant le cours, car j'ai des problèmes d'audition. Merci d'avance !");
        mission1.setStatutMission(statutMission3);
        missionService.saveMission(mission1);

        Mission mission2 = new Mission();
        mission2.setCreateur(user1);
        mission2.setBenevole(user2);
        mission2.setTitre("Déjeuner");
        mission2.setDateHeure("Le 15 Octobre 2021 à 10h30");
        mission2.setDuree("30min");
        mission2.setLieu("Locaux de l'EPSI");
        mission2.setEtablissement(etablissement1);
        mission2.setDescription("Est-ce que quelqu'un pourrait me rendre service et aller me chercher quelque chose à la boulangerie ce jour là. Je n'aurais pas le temps de préparer quelque chose à manger et j'ai des problèmes pour me déplacer.");
        mission2.setStatutMission(statutMission2);
        missionService.saveMission(mission2);

        Mission mission3 = new Mission();
        mission3.setCreateur(user1);
        mission3.setTitre("Covoiturage");
        mission3.setDateHeure("Le 22 Octobre 2021 à 8H00");
        mission3.setDuree("30min");
        mission3.setLieu("Trajet domicile / centre de formation");
        mission3.setEtablissement(etablissement2);
        mission3.setDescription("Je n'aurais personne pour m'emmener sur le lieu de formation ce jour là. Je cherche donc un covoiturage.");
        mission3.setStatutMission(statutMission1);
        missionService.saveMission(mission3);

        Mission mission4 = new Mission();
        mission4.setCreateur(user1);
        mission4.setTitre("Aide révisions");
        mission4.setDateHeure("Le 22 Octobre 2021 à 12H00");
        mission4.setDuree("30min");
        mission4.setLieu("Bibliothèque");
        mission4.setEtablissement(etablissement2);
        mission4.setDescription("J'ai des problèmes d'attention et souhaiterais pouvoir réviser avec quelqu'un qui puisse m'expliquer les concepts vus en cours. Merci pour votre aide.");
        mission4.setStatutMission(statutMission1);
        missionService.saveMission(mission4);

        return "{'status' : 'ok'}";
    }
}
