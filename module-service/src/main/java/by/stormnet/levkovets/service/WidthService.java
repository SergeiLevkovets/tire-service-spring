package by.stormnet.levkovets.service;

import by.stormnet.levkovets.dto.WidthDTO;

import java.util.List;

public interface WidthService {
    WidthDTO getById(Integer id);

    WidthDTO getByName(String name);

    List<WidthDTO> getAll();

    void deleteById(Integer id);

    void saveOrUpdate(WidthDTO widthDto);
}
