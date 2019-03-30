package szok_hb.tables;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "participants")
public class Participant {

    @Id
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientID")
    private Client clientID;

    @Column
    private String firstName;
    private String secondName;
}
