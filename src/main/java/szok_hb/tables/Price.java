package szok_hb.tables;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "prices")
public class Price {

    @Id
    private int id;

    @Column
    private BigDecimal value;
    private Timestamp validFrom;
    private Timestamp validTo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "conferenceID")
    private Conference conferenceID;
}
