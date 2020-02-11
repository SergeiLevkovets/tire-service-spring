package by.stormnet.levkovets.dao;

import by.stormnet.levkovets.domains.Height;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * DAO interface for{@link Height} class.
 * */

@Repository
@Transactional
public interface HeightDAO extends JpaRepository<Height, Integer> {

}
