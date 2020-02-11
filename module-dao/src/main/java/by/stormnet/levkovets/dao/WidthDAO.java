package by.stormnet.levkovets.dao;

import by.stormnet.levkovets.domains.Width;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * DAO interface for{@link Width} class.
 * */

@Repository
@Transactional
public interface WidthDAO extends JpaRepository<Width, Integer> {

}
