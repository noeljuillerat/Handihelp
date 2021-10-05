package epsi.workshop.handihelp.Controller;

import epsi.workshop.handihelp.Service.EtablissementService;
import epsi.workshop.handihelp.dao.entity.Etablissement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/etablissement")
public class EtablissementController {

    // Autowired
    private final EtablissementService etablissementService;
    @Autowired
    public EtablissementController (EtablissementService etablissementService) {
        this.etablissementService = etablissementService;
    }

    @GetMapping("/list")
    public Iterable<Etablissement> getAllEtablissement() {
        return etablissementService.getAllEtablissement();
    }
}
