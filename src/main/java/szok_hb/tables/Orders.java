package szok_hb.tables;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
@Table(name = "orders")
public class Orders {

    @Id
    private int id;

    @Column
    private Date orderDate;
    private Date expireDate;
    private Date paymentDate;
    private BigDecimal value;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientID")
    private Client clientID;
}
