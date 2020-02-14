package by.stormnet.levkovets.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Simple javaBean domain object that represent the fit diameter of a tire
 * */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "diameters")
public class Diameter extends BaseEntity{

    private String diameter;

   }
