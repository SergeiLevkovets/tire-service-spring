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
    private String width;

    @NonNull
    private String height;

    @NonNull
    private String diameter;

    private String date;

}
