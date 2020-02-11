package by.stormnet.levkovets.service;

import by.stormnet.levkovets.dto.ServiceItemDTO;
import by.stormnet.levkovets.dto.TypeDTO;

import java.util.List;

public interface ServiceItemService {
    ServiceItemDTO getById(Integer id);

    ServiceItemDTO getByName(String name);

    List<ServiceItemDTO> getAll();

    List<ServiceItemDTO> getAllByTypeInServiceItemPrice(TypeDTO type);

    void deleteById(Integer id);

    void saveOrUpdate(ServiceItemDTO serviceItemDto);
}
