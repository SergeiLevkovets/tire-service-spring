package by.stormnet.levkovets.dao;

import by.stormnet.levkovets.domains.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * DAO interface for{@link Type} class.
 * */

@Repository
@Transactional
public interface TypeDAO extends JpaRepository<Type, Integer> {

}
