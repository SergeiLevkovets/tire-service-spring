package by.stormnet.levkovets.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WidthDTO extends BaseDto {

    private Integer id;

    @NonNull
    private String width;

}
