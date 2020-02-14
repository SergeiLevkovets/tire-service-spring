package by.stormnet.levkovets.service;

import by.stormnet.levkovets.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO getById(Integer id);

    UserDTO getByEmail(String email);

    UserDTO getByPhone(String phone);

    void save(UserDTO user);

    void delet(Integer id);

    List<UserDTO> getAll();

}
