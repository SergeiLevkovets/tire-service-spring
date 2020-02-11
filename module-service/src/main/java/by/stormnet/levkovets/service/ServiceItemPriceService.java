package by.stormnet.levkovets.service;

import by.stormnet.levkovets.dto.ServiceItemDTO;
import by.stormnet.levkovets.dto.ServiceItemPriceDTO;
import by.stormnet.levkovets.dto.TypeDTO;

import java.util.List;

public interface ServiceItemPriceService {
    ServiceItemPriceDTO getById(Integer id);

    List<ServiceItemPriceDTO> getAllByType(TypeDTO type);

    List<ServiceItemPriceDTO> getAllUniqueByType(TypeDTO type);

    List<ServiceItemPriceDTO> getAllServiceItemPriceByServiceItem(ServiceItemDTO serviceItem);

    List<ServiceItemPriceDTO> getAll();

    void deleteById(Integer id);

    void saveOrUpdate(ServiceItemPriceDTO serviceItemPriceDto);
}
