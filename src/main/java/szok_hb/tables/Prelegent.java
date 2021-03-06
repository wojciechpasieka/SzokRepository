package szok_hb.tables;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "prelegents")
public class Prelegent {

    @Id
    private int id;

    @Column
    private String firstName;
    private String secondName;
    private Double cost;


}
