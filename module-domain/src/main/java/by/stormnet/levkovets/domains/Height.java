package by.stormnet.levkovets.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Simple javaBean domain object representing the height of a tire
 * */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "heights")
public class Height extends BaseEntity{

    @Column(name = "height")
    private String height;

}
