package by.stormnet.levkovets.service.impl;

import by.stormnet.levkovets.dao.HeightDAO;
import by.stormnet.levkovets.dto.HeightDTO;
import by.stormnet.levkovets.service.HeightService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HeightServiceImpl implements HeightService {

    @Autowired
    HeightDAO heightDAO;

    @Override
    public HeightDTO getById(Integer id) {
        return null;
    }

    @Override
    public HeightDTO getByName(String name) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<HeightDTO> getAll() {
        return null;
    }

    @Override
    public void saveOrUpdate(HeightDTO heightDto) {

    }
}
