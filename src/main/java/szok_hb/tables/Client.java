package szok_hb.tables;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "clients")
public class Client {

    @Id
    private int Id;

    @Column
    private String name;
    private int discount;

}
