package in.ashokit;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDtlsRepository extends CrudRepository<UserDtls,Integer> {

}
