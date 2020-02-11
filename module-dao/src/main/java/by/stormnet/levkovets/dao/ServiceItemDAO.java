package by.stormnet.levkovets.dao;

import by.stormnet.levkovets.domains.ServiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * DAO interface for{@link ServiceItem} class.
 * */

@Repository
@Transactional
public interface ServiceItemDAO extends JpaRepository<ServiceItem, Integer> {

}
