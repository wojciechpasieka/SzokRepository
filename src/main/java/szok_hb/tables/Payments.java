package szok_hb.tables;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name = "payments")
public class Payments {
    @Id
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId")
    private Orders orderId;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;

    private double value;


}
