package guru.springframework.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created By oothan on Jun, 2022
 */
@Data
@Entity
public class Ingredient {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String description;
     private BigDecimal amount;

     @ManyToOne
     private Recipe recipe;
}
