package by.stormnet.levkovets.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Simple javaBean domain object representing a type of service
 * */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "types")
public class Type extends BaseEntity {

    @Column(name = "type")
    private String type;

}
