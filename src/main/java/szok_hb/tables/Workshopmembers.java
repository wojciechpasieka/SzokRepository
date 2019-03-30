package szok_hb.tables;

import lombok.Data;
import org.hibernate.criterion.Order;

import javax.persistence.*;

@Data
@Entity
@Table (name = "workshopmembers")
public class Workshopmembers {

    @Id
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "participantsID")
    private Participant participantsID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workshopID")
    private Workshops workshopID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderID")
    private Order orderID;

    private boolean payed;
}
