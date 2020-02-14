package by.stormnet.levkovets.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO extends BaseDto {
    private Integer id;

    @NonNull
    private String userName;

    @NonNull
    private TireDTO tire;

    @NonNull
    private String type;

    private String date;

}
