package by.stormnet.levkovets.dao;

import by.stormnet.levkovets.domains.Diameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * DAO interface for{@link Diameter} class.
 * */

@Repository
@Transactional
public interface DiameterDAO extends JpaRepository<Diameter, Integer> {

}
