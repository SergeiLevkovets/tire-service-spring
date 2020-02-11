package by.stormnet.levkovets.service.impl;

import by.stormnet.levkovets.dao.UserDAO;
import by.stormnet.levkovets.dto.UserDTO;
import by.stormnet.levkovets.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public UserDTO getById(Integer id) {
        log.info("IN UserServiceImpl getById {}", id);
        return null;
    }

    @Override
    public void save(UserDTO user) {
        log.info("IN UserServiceImpl save {}", user);


    }

    @Override
    public void delet(Integer id) {
        log.info("IN UserServiceImpl delet {}", id);


    }

    @Override
    public List<UserDTO> getAll() {
        log.info("IN UserServiceImpl getAll Users");

        return null;
    }
}
