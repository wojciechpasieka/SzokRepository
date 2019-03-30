package szok_hb.tables;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "lectures")
public class Lecture {

    @javax.persistence.Id
    private int id;

    @Column
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "conferenceID")
    private Conference conferenceID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prelegentID")
    private Prelegent prelegentID;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    private Date endTime;
}
