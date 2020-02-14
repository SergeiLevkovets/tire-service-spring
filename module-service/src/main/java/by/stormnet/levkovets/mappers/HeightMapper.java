package by.stormnet.levkovets.mappers;

import by.stormnet.levkovets.domains.Height;
import by.stormnet.levkovets.dto.HeightDTO;
import org.mapstruct.Mapper;

@Mapper
public interface HeightMapper {

    HeightDTO toHeightDto(Height height);

    Height toHeight(HeightDTO heightDTO);

}
