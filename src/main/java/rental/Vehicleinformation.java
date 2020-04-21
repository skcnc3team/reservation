package rental;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Vehicleinformation_table")
public class Vehicleinformation {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String carId;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public String getCarId() {
            return carId;
        }

        public void setCarId(String carId) {
            this.carId = carId;
        }

}
