package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Objects;

/**
 * /**
 * A class to represent a bike.
 *
 * @author bchase
 */
@Entity(name = "Bike")
@Table(name = "bike")

public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "modelYear")
    private String modelYear;

    @Column(name = "bikeBrand")
    private String bikeBrand;

    @Column(name = "bikeName")
    private String bikeName;

    @Column(name = "accessories")
    private String accessories;

    @ManyToOne
    private User user;

    /**
     * Instantiates a new Bike.
     */
    public Bike() {
    }

    /**
     * Instantiates a new Bike.
     *
     * @param modelYear   the model year
     * @param bikeBrand   the bike brand
     * @param bikeName    the bike name
     * @param accessories the accessories
     * @param user        the user
     */
    public Bike(String modelYear, String bikeBrand, String bikeName, String accessories, User user) {
        this.modelYear = modelYear;
        this.bikeBrand = bikeBrand;
        this.bikeName = bikeName;
        this.accessories = accessories;
        this.user = user;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets model year.
     *
     * @return the model year
     */
    public String getModelYear() {
        return modelYear;
    }

    /**
     * Sets model year.
     *
     * @param modelYear the model year
     */
    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    /**
     * Gets bike brand.
     *
     * @return the bike brand
     */
    public String getBikeBrand() {
        return bikeBrand;
    }

    /**
     * Sets bike brand.
     *
     * @param bikeBrand the bike brand
     */
    public void setBikeBrand(String bikeBrand) {
        this.bikeBrand = bikeBrand;
    }

    /**
     * Gets bike name.
     *
     * @return the bike name
     */
    public String getBikeName() {
        return bikeName;
    }

    /**
     * Sets bike name.
     *
     * @param bikeName the bike name
     */
    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    /**
     * Gets accessories.
     *
     * @return the accessories
     */
    public String getAccessories() {
        return accessories;
    }

    /**
     * Sets accessories.
     *
     * @param accessories the accessories
     */
    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", modelYear='" + modelYear + '\'' +
                ", bikeBrand='" + bikeBrand + '\'' +
                ", bikeName='" + bikeName + '\'' +
                ", accessories='" + accessories + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bike)) return false;
        Bike bike = (Bike) o;
        return getId() == bike.getId() &&
                Objects.equals(getModelYear(), bike.getModelYear()) &&
                Objects.equals(getBikeBrand(), bike.getBikeBrand()) &&
                Objects.equals(getBikeName(), bike.getBikeName()) &&
                Objects.equals(getAccessories(), bike.getAccessories()) &&
                Objects.equals(getUser(), bike.getUser());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getModelYear(), getBikeBrand(), getBikeName(), getAccessories(), getUser());
    }
}
