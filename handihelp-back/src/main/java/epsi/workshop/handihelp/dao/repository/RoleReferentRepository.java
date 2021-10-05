package epsi.workshop.handihelp.dao.repository;

import epsi.workshop.handihelp.dao.entity.RoleReferent;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleReferentRepository extends PagingAndSortingRepository<RoleReferent, Long> {
}
