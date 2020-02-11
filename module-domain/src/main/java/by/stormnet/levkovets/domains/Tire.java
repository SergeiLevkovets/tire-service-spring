package by.stormnet.levkovets.domains;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Simple javaBean domain object representing a tire
 * */

@Entity
@Data
@NoArgsConstructor
@Table(name = "tires")
public class Tire extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "fk_width_id")
    private Width width;

    @ManyToOne
    @JoinColumn(name = "fk_height_id")
    private Height height;

    @ManyToOne
    @JoinColumn(name = "fk_diameter_id")
    private Diameter diameter;

    @Column(name = "date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

}
