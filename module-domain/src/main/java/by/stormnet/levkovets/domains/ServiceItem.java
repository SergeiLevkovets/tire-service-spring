package by.stormnet.levkovets.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Simple javaBean domain object representing services
 * */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "service_items")
public class ServiceItem extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "article")
    private String article;

}
