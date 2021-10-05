package epsi.workshop.handihelp.Service;

import epsi.workshop.handihelp.dao.entity.Etablissement;
import epsi.workshop.handihelp.dao.repository.EtablissementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EtablissementService {
    //Autowired
    private final EtablissementRepository etablissementRepository;

    @Autowired
    public EtablissementService (EtablissementRepository etablissementRepository) {
        this.etablissementRepository = etablissementRepository;
    }

    public Iterable<Etablissement> getAllEtablissement() {
        return etablissementRepository.findAll();
    }

    @Transactional
    public void saveEtablissement(Etablissement etablissement) {
        etablissementRepository.save(etablissement);
    }
}
