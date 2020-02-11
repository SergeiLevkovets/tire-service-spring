package by.stormnet.levkovets.service.impl;

import by.stormnet.levkovets.dao.DiameterDAO;
import by.stormnet.levkovets.dto.DiameterDTO;
import by.stormnet.levkovets.service.DiameterService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DiameterServiceImpl implements DiameterService {

    @Autowired
    DiameterDAO diameterDAO;


    @Override
    public DiameterDTO getById(Integer id) {
        return null;
    }

    @Override
    public DiameterDTO getByName(String name) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<DiameterDTO> getAll() {
        return null;
    }

    @Override
    public void saveOrUpdate(DiameterDTO diameterDto) {

    }
}
