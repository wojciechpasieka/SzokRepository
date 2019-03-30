package szok_hb.tables;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "conferencemembers")
public class ConferenceMember {

    @Id
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "participantsID")
    private Participant participantsID;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "conferenceID")
    private Conference conferenceID;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderID")
    private Orders orderID;

    @Column
    private int payed;
}
