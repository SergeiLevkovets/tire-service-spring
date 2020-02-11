package by.stormnet.levkovets.service.impl;

import by.stormnet.levkovets.dto.OrderDTO;
import by.stormnet.levkovets.dto.TireDTO;
import by.stormnet.levkovets.dto.TypeDTO;
import by.stormnet.levkovets.dto.UserDTO;
import by.stormnet.levkovets.service.OrderService;

import java.util.Date;
import java.util.List;

public class OrderServiceImpl implements OrderService {


    @Override
    public OrderDTO getById(Integer id) {
        return null;
    }

    @Override
    public List<OrderDTO> getAll() {
        return null;
    }

    @Override
    public List<OrderDTO> getAllByDates(Date startDate, Date endDate) {
        return null;
    }

    @Override
    public List<OrderDTO> getAllByDatesAndUser(Date startDate, Date endDate, UserDTO userDTO) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Integer saveOrUpdate(OrderDTO orderDto) {
        return null;
    }

    @Override
    public OrderDTO createOrder(UserDTO userDTO, TireDTO tireDTO, TypeDTO typeDTO) {
        return null;
    }
}
