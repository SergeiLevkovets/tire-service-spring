package by.stormnet.levkovets.dao;

import by.stormnet.levkovets.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * DAO interface for{@link User} class.
 * */

@Repository
@Transactional
public interface UserDAO extends JpaRepository<User, Integer> {

}
