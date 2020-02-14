package by.stormnet.levkovets.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

/**
 * Simple javaBean domain object representing Order
 * */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order extends BaseEntity{

    @ManyToOne
    @JoinColumn(name="user_id")
    private User users;

    @ManyToOne
    @JoinColumn(name="tire_id")
    private Tire tire;

    @ManyToOne
    @JoinColumn(name="type_id")
    private Type type;

    @Column(name = "date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime date;

    @Column(name = "total_price")
    private Double totalPrice;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "orders_to_service_item_prices", joinColumns = @JoinColumn(name = "order_id") )
    @Column(name="count")
    @MapKeyJoinColumn(name = "service_item_price_id")
    private Map<ServiceItemPrice, Integer> ServiceItemPrices;





}
