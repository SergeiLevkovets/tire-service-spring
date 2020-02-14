package by.stormnet.levkovets.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Simple javaBean domain object representing the width of a tire
 * */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "widths")
public class Width extends BaseEntity{

    private String width;

}
