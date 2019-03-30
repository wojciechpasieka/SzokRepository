package szok_hb.tables;

import lombok.Data;
import org.hibernate.criterion.Order;
import javax.persistence.*;
import java.sql.Date;


@Data
@Entity
@Table(name = "payments")
public class Payments {
    @Id
    private int id;

    @Column
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId")
    private Order orderId;
    private Date paymentDate;
    private double value;


}
