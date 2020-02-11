package by.stormnet.levkovets.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPageDTO extends BaseDto {

    @NonNull
    private TireDTO tire;

    @NonNull
    private TypeDTO type;

    private Date date;

    private List<ServiceItemPriceDTO> serviceItemPriceList;

}
