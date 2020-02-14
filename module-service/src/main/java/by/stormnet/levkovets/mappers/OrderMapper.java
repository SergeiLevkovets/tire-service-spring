package by.stormnet.levkovets.mappers;

import by.stormnet.levkovets.domains.Order;
import by.stormnet.levkovets.domains.User;
import by.stormnet.levkovets.dto.OrderDTO;
import by.stormnet.levkovets.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(uses = TireMapper.class)
public interface OrderMapper {

    /*OrderDTO toOrderDto(Order order);

    Order toOrder(OrderDTO orderDTO);*/

}
