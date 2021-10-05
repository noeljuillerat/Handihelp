package epsi.workshop.handihelp.dao.repository;

import epsi.workshop.handihelp.dao.entity.StatutMission;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutMissionRepository extends PagingAndSortingRepository<StatutMission, Long> {
}
