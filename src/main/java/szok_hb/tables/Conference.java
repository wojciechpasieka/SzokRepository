package szok_hb.tables;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "conferences")
public class Conference {

    @Id
    private int id;

    @Column
    private String name;
    private String place;
    private Date startDate;
    private Date endDate;
    private int quantityLimit;
}
