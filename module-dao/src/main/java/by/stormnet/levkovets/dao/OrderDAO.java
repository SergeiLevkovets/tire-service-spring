package by.stormnet.levkovets.dao;

import by.stormnet.levkovets.domains.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * DAO interface for{@link Order} class.
 * */

@Repository
@Transactional
public interface OrderDAO extends JpaRepository<Order, Integer> {

}
