package szok_hb.tables;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "workshops")
public class Workshops {

    @javax.persistence.Id
    private int id;

    @Column
    private String worksopName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "conferenceID")
    private Conference conferenceID;

    @Column
    private int workshopCapacity;
    private int workshopPrice;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    private Date endTime;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prelegentID")
    private Prelegent prelegentID;
}

