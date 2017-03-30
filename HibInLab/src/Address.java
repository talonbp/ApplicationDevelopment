/**
 * Created by Talon on 3/29/2017.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue
    private Integer id;
    private String Address;
    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
}

