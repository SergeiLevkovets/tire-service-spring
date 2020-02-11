package by.stormnet.levkovets.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "service_item_prices")
public class ServiceItemPrice {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="fk_service_item_id")
    private ServiceItem serviceItem;

    @ManyToOne
    @JoinColumn(name="fk_type_id")
    private Type type;

    @ManyToOne
    @JoinColumn(name="fk_diameter_id")
    private Diameter diameter;

    @Column(name = "price")
    private Double price;

}
