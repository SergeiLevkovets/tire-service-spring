package by.stormnet.levkovets.dao;

import by.stormnet.levkovets.domains.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface UserDAO extends CrudRepository<User, Integer> {

}
