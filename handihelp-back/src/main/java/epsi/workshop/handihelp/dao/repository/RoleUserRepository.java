package epsi.workshop.handihelp.dao.repository;

import epsi.workshop.handihelp.dao.entity.RoleUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleUserRepository extends PagingAndSortingRepository<RoleUser, Long> {
}
