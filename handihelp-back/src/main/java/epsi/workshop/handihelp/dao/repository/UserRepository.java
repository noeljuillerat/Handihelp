package epsi.workshop.handihelp.dao.repository;

import epsi.workshop.handihelp.dao.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
