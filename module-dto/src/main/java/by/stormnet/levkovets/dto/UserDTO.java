package by.stormnet.levkovets.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends BaseDto {

    private Integer id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @NonNull
    private String password;

    @NonNull
    private String confirmPassword;

    @NonNull
    private String phone;

    private String role;

}
