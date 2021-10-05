package epsi.workshop.handihelp.dao.repository;

import epsi.workshop.handihelp.dao.entity.Mission;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends PagingAndSortingRepository<Mission, Long> {
}
