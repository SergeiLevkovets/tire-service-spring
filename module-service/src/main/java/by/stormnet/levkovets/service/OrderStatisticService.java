package by.stormnet.levkovets.service;

import by.stormnet.levkovets.dto.OrderDTO;
import by.stormnet.levkovets.dto.OrderStatisticDTO;

public interface OrderStatisticService {

    OrderStatisticDTO createOrderStatistic(OrderDTO orderDTO);
}
