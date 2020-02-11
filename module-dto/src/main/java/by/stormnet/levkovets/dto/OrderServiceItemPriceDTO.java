package by.stormnet.levkovets.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderServiceItemPriceDTO extends BaseDto {
    private Integer id;

    @NonNull
    private OrderDTO order;

    @NonNull
    private ServiceItemPriceDTO serviceItemPrice;

    @NonNull
    private Integer count;

    @NonNull
    private Double totalPrice;
}
