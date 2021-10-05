package epsi.workshop.handihelp.dao.repository;

import epsi.workshop.handihelp.dao.entity.TypeMission;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMissionRepository extends PagingAndSortingRepository<TypeMission, Long> {
}
