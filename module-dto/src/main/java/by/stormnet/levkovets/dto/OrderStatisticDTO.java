package by.stormnet.levkovets.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderStatisticDTO extends BaseDto {

    private Integer id;

    @NonNull
    private OrderDTO order;

    @NonNull
    private Double totalPrice;

    @NonNull
    private List<OrderServiceItemPriceDTO> orderServiceItemPriceDTOList;
}
