package by.stormnet.levkovets.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Simple javaBean domain object representing the cost of services
 * */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "service_item_prices")
public class ServiceItemPrice extends BaseEntity {

    @ManyToOne
    @JoinColumn(name="service_item_id")
    private ServiceItem serviceItem;

    @ManyToOne
    @JoinColumn(name="type_id")
    private Type type;

    @ManyToOne
    @JoinColumn(name="diameter_id")
    private Diameter diameter;

    private Double price;

}
