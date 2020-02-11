package by.stormnet.levkovets.service;

import by.stormnet.levkovets.dto.DiameterDTO;

import java.util.List;

public interface DiameterService {
    DiameterDTO getById(Integer id);

    DiameterDTO getByName(String name);

    void deleteById(Integer id);

    List<DiameterDTO> getAll();

    void saveOrUpdate(DiameterDTO diameterDto);
}
