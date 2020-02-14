package by.stormnet.levkovets.mappers;

import by.stormnet.levkovets.domains.Diameter;
import by.stormnet.levkovets.dto.DiameterDTO;
import org.mapstruct.Mapper;

@Mapper
public interface DiameterMapper {

    DiameterDTO toDiameterDto(Diameter diameter);

    Diameter toDiameter(DiameterDTO diameterDTO);

}
