package by.stormnet.levkovets.service.impl;

import by.stormnet.levkovets.dao.UserDAO;
import by.stormnet.levkovets.domains.User;
import by.stormnet.levkovets.dto.UserDTO;
import by.stormnet.levkovets.mappers.UserMapper;
import by.stormnet.levkovets.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserDAO userDAO, UserMapper userMapper) {
        this.userDAO = userDAO;
        this.userMapper = userMapper;
    }

    @Override
    public UserDTO getByEmail(String email) {
        User byEmail = userDAO.findByEmail(email);
        UserDTO userDTO = userMapper.userToUserDTO(byEmail);
        return userDTO;
    }

    @Override
    public UserDTO getByPhone(String phone) {
        User byEmail = userDAO.findByPhone(phone);
        UserDTO userDTO = userMapper.userToUserDTO(byEmail);
        return userDTO;
    }

    @Override
    public UserDTO getById(Integer id) {
        log.info("IN UserServiceImpl getById {}", id);
        User byEmail = userDAO.findById(id).get();
        UserDTO userDTO = userMapper.userToUserDTO(byEmail);
        return userDTO;
    }

    @Override
    public void save(UserDTO user) {
        log.info("IN UserServiceImpl save {}", user);
        userDAO.save(userMapper.UserDTOToUser(user));
        log.info("IN UserServiceImpl saved", user);
    }

    @Override
    public void delet(Integer id) {
        log.info("IN UserServiceImpl delete {}", id);
        userDAO.deleteById(id);
        log.info("IN UserServiceImpl deleted {}", id);

    }

    @Override
    public List<UserDTO> getAll() {
        log.info("IN UserServiceImpl getAll Users");
        return userDAO.findAll()
                .stream()
                .map(userMapper::userToUserDTO)
                .collect(Collectors.toList());
    }
}
