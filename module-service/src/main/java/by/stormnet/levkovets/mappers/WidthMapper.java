package by.stormnet.levkovets.mappers;

import by.stormnet.levkovets.domains.Width;
import by.stormnet.levkovets.dto.WidthDTO;
import org.mapstruct.Mapper;

@Mapper
public interface WidthMapper {

    WidthDTO toWidthDto(Width width);

    Width toWidth(WidthDTO widthDTO);

}
