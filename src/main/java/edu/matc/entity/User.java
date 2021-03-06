package edu.matc.entity;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A class to represent a user.
 *
 * @author bchase
 */
@Entity(name = "User")
@Table(name = "user")
public class User {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int UserId;

    @Column(name = "createDate")
    @CreationTimestamp
    private Timestamp createDate;

    @Column(name = "email")
    private String email;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "pass")
    private String pass;

    @Column(name = "updateDate")
    @UpdateTimestamp
    private Timestamp updateDate;

    @Column(name = "userName")
    private String userName;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Bike> bikes = new HashSet<>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<BikeRides> bikeRides = new HashSet<>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();

    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param UserId     the userId
     * @param createDate the date the user is created
     * @param email      the email address
     * @param firstName  the first name
     * @param lastName   the last name
     * @param pass       the password
     * @param updateDate the date the user is updated
     * @param userName   the user name
     */
    public User(int UserId, Timestamp createDate, String email, String firstName, String lastName, String pass,
                Timestamp updateDate, String userName) {
        this.UserId = UserId;
        this.createDate = createDate;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pass = pass;
        this.updateDate = updateDate;
        this.userName = userName;
    }

    /**
     * Gets UserId.
     *
     * @return the UserId
     */
    public int getUserId() {
        return UserId;
    }

    /**
     * Sets UserId.
     *
     * @param UserId the UserId
     */
    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    /**
     * Gets the createDate
     *
     * @return the create date
     */
    public Timestamp getCreateDate() {
        return createDate;
    }

    /**
     * Sets the createDate
     *
     * @param createDate the create date
     */
    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the password
     *
     * @return the password
     */
    public String getPassword() {
        return pass;
    }

    /**
     * Sets the password
     *
     * @param pass the password
     */
    public void setPassword(String pass) {
        this.pass = pass;
    }

    /**
     * Gets the updateDate
     *
     * @return the update date
     */
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the updateDate
     *
     * @param updateDate the update date
     */
    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets bike.
     *
     * @return the bike
     */
    public Set<Bike> getBikes() {
        return bikes;
    }

    /**
     * Sets bike.
     *
     * @param bikes the bikes
     */
    public void setBike(Set<Bike> bikes) {
        this.bikes = bikes;
    }

    /**
     * Gets roles.
     *
     * @return the roles
     */
    public Set<Role> getRoles() {
        return roles;
    }

    /**
     * Sets roles.
     *
     * @param roles the roles
     */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    /**
     * Adds a bike
     * @param bike
     */
    public void addBike(Bike bike) {
        bikes.add(bike);
        bike.setUser(this);
    }

    /**
     * Gets bike ride.
     *
     * @return the bike ride
     */
    public Set<BikeRides> getBikeRides() {
        return bikeRides;
    }

    /**
     * Sets bike ride.
     *
     * @param bikeRides the bike ride
     */
    public void setBikeRides(Set<BikeRides> bikeRides) {
        this.bikeRides = bikeRides;
    }

    /**
     * Adds a bike ride
     * @param bikeRide
     */
    public void addBikeRide(BikeRides bikeRide) {
        bikeRides.add(bikeRide);
        bikeRide.setUser(this);
    }

    /**
     * Add role.
     *
     * @param role the role
     */
    public void addRole(Role role) {
        roles.add(role);
        role.setUser(this);
    }

    /**
     * Remove role.
     *
     * @param role the role
     */
    public void removeRole(Role role) {
        roles.remove(role);
        role.setUser(null);
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId='" + UserId + '\'' +
                ", createDate" + createDate + '\'' +
                ", email" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pass='" + pass + '\'' +
                ", updateDate" + updateDate + '\'' +
                ", userName" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getUserId() == user.getUserId() &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getFirstName(), user.getFirstName()) &&
                Objects.equals(getLastName(), user.getLastName()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getUserName(), user.getUserName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getUserId(), getEmail(), getFirstName(), getLastName(), getPassword(), getUserName());
    }
}