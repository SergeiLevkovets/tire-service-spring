package by.stormnet.levkovets.service;

import by.stormnet.levkovets.dto.OrderDTO;
import by.stormnet.levkovets.dto.TireDTO;
import by.stormnet.levkovets.dto.TypeDTO;
import by.stormnet.levkovets.dto.UserDTO;

import java.util.Date;
import java.util.List;

public interface OrderService {
    OrderDTO getById(Integer id);

    List<OrderDTO> getAll();

    List<OrderDTO> getAllByDates(Date startDate, Date endDate);

    List<OrderDTO> getAllByDatesAndUser(Date startDate, Date endDate, UserDTO userDTO);

    void deleteById(Integer id);

    Integer saveOrUpdate(OrderDTO orderDto);

    OrderDTO createOrder(UserDTO userDTO, TireDTO tireDTO, TypeDTO typeDTO);
}
