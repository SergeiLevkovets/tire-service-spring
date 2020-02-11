package by.stormnet.levkovets.service.impl;

import by.stormnet.levkovets.dto.OrderDTO;
import by.stormnet.levkovets.dto.OrderServiceItemPriceDTO;
import by.stormnet.levkovets.dto.ServiceItemPriceDTO;
import by.stormnet.levkovets.service.OrderServiceItemPriceService;

import java.util.List;
import java.util.Map;

public class OrderServiceItemPriceServiceImpl implements OrderServiceItemPriceService {


    @Override
    public OrderServiceItemPriceDTO getById(Integer id) {
        return null;
    }

    @Override
    public List<OrderServiceItemPriceDTO> getAll() {
        return null;
    }

    @Override
    public List<OrderServiceItemPriceDTO> getAllByOrder(OrderDTO dto) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByOrderId(Integer id) {

    }

    @Override
    public void saveOrUpdate(OrderServiceItemPriceDTO dto) {

    }

    @Override
    public void saveOrUpdateAll(List<OrderServiceItemPriceDTO> list) {

    }

    @Override
    public List<OrderServiceItemPriceDTO> createOrderToServiceItemPrices(OrderDTO orderDto, Map<ServiceItemPriceDTO, Integer> serviceItemPricesAndCount) {
        return null;
    }
}
