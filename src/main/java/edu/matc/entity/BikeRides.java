package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

/**
 * /**
 * A class to represent a bike ride.
 *
 * @author bchase
 */
@Entity(name = "BikeRides")
@Table(name = "bikeRides")

public class BikeRides {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "milesRidden")
    private int milesRidden;

    @Column(name = "rideDescription")
    private String rideDescription;

    @ManyToOne
    private User user;

    /**
     * Instantiates a new BikeRide.
     */
    public BikeRides() {
    }

    /**
     * Instantiates a new BikeRide.
     *
     * @param milesRidden     the miles ridden
     * @param rideDescription the ride description
     * @param user           the user
     */
    public BikeRides(int milesRidden, String rideDescription, User user) {
        this.milesRidden = milesRidden;
        this.rideDescription = rideDescription;
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
     * Gets miles ridden.
     *
     * @return the miles ridden
     */
    public int getMilesRidden() {
        return milesRidden;
    }

    /**
     * Sets miles ridden.
     *
     * @param milesRidden the miles ridden
     */
    public void setMilesRidden(int milesRidden) {
        this.milesRidden = milesRidden;
    }

    /**
     * Gets ride description.
     *
     * @return the ride description
     */
    public String getRideDescription() {
        return rideDescription;
    }

    /**
     * Sets ride description.
     *
     * @param rideDescription the ride description
     */
    public void setRideDescription(String rideDescription) {
        this.rideDescription = rideDescription;
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
        return "BikeRides{" +
                "id=" + id +
                ", milesRidden=" + milesRidden +
                ", rideDescription='" + rideDescription + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BikeRides)) return false;
        BikeRides bikeRides = (BikeRides) o;
        return getId() == bikeRides.getId() &&
                getMilesRidden() == bikeRides.getMilesRidden() &&
                Objects.equals(getRideDescription(), bikeRides.getRideDescription()) &&
                Objects.equals(getUser(), bikeRides.getUser());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getMilesRidden(), getRideDescription(), getUser());
    }
}
