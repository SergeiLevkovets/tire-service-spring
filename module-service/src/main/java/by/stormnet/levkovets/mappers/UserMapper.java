package by.stormnet.levkovets.mappers;

import by.stormnet.levkovets.domains.User;
import by.stormnet.levkovets.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDTO userToUserDTO(User user);

    User UserDTOToUser(UserDTO userDTO);

}
