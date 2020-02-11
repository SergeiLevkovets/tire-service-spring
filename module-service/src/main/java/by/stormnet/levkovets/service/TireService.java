package by.stormnet.levkovets.service;

import by.stormnet.levkovets.dto.DiameterDTO;
import by.stormnet.levkovets.dto.HeightDTO;
import by.stormnet.levkovets.dto.TireDTO;
import by.stormnet.levkovets.dto.WidthDTO;

import java.util.List;

public interface TireService {
    TireDTO getById(Integer id);

    List<TireDTO> getAll();

    void deleteById(Integer id);

    Integer saveOrUpdate(TireDTO tireDto);

    TireDTO createTireDTO(WidthDTO widthDto, HeightDTO heightDto, DiameterDTO diameterDto);

    List<TireDTO> loadCountTOP(Integer count);
}
