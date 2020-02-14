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
    private String serviceItemName;

    @NonNull
    private String type;

    private String diameter;

    @NonNull
    private Double price;


}
