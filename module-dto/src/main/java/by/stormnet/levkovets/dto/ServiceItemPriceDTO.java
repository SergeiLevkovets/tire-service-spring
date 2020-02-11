package by.stormnet.levkovets.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceItemPriceDTO extends BaseDto {

    private Integer id;

    @NonNull
    private ServiceItemDTO serviceItem;

    @NonNull
    private TypeDTO type;

    private DiameterDTO diameter;

    @NonNull
    private Double price;


}
