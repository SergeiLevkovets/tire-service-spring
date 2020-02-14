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
    private String tire;

    @NonNull
    private String type;

    private String date;

    private List<ServiceItemPriceDTO> serviceItemPriceList;

}
