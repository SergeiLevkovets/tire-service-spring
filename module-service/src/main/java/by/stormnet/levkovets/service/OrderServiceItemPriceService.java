package by.stormnet.levkovets.service;

import by.stormnet.levkovets.dto.OrderDTO;
import by.stormnet.levkovets.dto.OrderServiceItemPriceDTO;
import by.stormnet.levkovets.dto.ServiceItemPriceDTO;

import java.util.List;
import java.util.Map;

public interface OrderServiceItemPriceService {
    OrderServiceItemPriceDTO getById(Integer id);

    List<OrderServiceItemPriceDTO> getAll();

    List<OrderServiceItemPriceDTO> getAllByOrder(OrderDTO dto);

    void deleteById(Integer id);

    void deleteByOrderId(Integer id);

    void saveOrUpdate(OrderServiceItemPriceDTO dto);

    void saveOrUpdateAll(List<OrderServiceItemPriceDTO> list);

    List<OrderServiceItemPriceDTO> createOrderToServiceItemPrices(OrderDTO orderDto, Map<ServiceItemPriceDTO, Integer> serviceItemPricesAndCount);
}
