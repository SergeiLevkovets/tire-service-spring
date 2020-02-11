package by.stormnet.levkovets.service;

import by.stormnet.levkovets.dto.TypeDTO;

import java.util.List;

public interface TypeService {
    TypeDTO getById(Integer id);

    TypeDTO getByName(String name);

    void deleteById(Integer id);

    List<TypeDTO> getAll();

    void saveOrUpdate(TypeDTO typeDto);
}
