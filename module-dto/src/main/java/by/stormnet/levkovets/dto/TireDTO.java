package by.stormnet.levkovets.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TireDTO extends BaseDto {
    private Integer id;

    @NonNull
    private WidthDTO width;

    @NonNull
    private HeightDTO height;

    @NonNull
    private DiameterDTO diameter;

    private Date date;

}
