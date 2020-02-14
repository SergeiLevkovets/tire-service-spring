package by.stormnet.levkovets.mappers;

import by.stormnet.levkovets.domains.Tire;
import by.stormnet.levkovets.domains.User;
import by.stormnet.levkovets.dto.TireDTO;
import by.stormnet.levkovets.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TireMapper {

    @Mapping(source = "width.width", target = "width")
    @Mapping(source = "height.height", target = "height")
    @Mapping(source = "diameter.diameter", target = "diameter")
    TireDTO toTireDto(Tire tire);

    @Mapping(source = "width", target = "width.width")
    @Mapping(source = "height", target = "height.height")
    @Mapping(source = "diameter", target = "diameter.diameter")
    Tire toTire(TireDTO tireDTO);

}
