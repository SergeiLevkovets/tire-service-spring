package by.stormnet.levkovets.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceItemDTO extends BaseDto {

    private Integer id;

    @NonNull
    private String name;

    @NonNull
    private String article;


}
