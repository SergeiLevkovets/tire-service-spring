package by.stormnet.levkovets.domains;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
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
    @JoinColumn(name = "width_id")
    private Width width;

    @ManyToOne
    @JoinColumn(name = "height_id")
    private Height height;

    @ManyToOne
    @JoinColumn(name = "diameter_id")
    private Diameter diameter;

    @Column(name = "date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime date;

}
