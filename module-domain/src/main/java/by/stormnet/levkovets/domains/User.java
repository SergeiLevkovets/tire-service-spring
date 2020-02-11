package by.stormnet.levkovets.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Simple javaBean domain object that represent User
 * */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(unique = true, name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(unique = true, name = "phone")
    private String phone;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "users_to_roles", joinColumns = @JoinColumn(name = "fk_user_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private List<Role> role;

}
