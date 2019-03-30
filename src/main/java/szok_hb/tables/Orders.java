package szok_hb.tables;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    private int clientID;
    private int conferenceID;
}
