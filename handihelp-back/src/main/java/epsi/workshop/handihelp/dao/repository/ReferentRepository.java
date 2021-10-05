package epsi.workshop.handihelp.dao.repository;

import epsi.workshop.handihelp.dao.entity.Referent;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferentRepository extends PagingAndSortingRepository<Referent, Long> {
}
