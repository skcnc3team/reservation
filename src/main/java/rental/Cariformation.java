package rental;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Cariformation_table")
public class Cariformation {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

}
