package camila.garcia.test.dao;

import camila.garcia.test.model.user.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

}
