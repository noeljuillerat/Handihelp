package epsi.workshop.handihelp.dao.repository;

import epsi.workshop.handihelp.dao.entity.Etablissement;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtablissementRepository extends PagingAndSortingRepository<Etablissement, Long> {
}
