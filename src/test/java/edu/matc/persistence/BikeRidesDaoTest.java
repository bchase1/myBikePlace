package edu.matc.persistence;

import edu.matc.entity.BikeRides;
import edu.matc.entity.User;
import edu.matc.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class BikeRidesDaoTest {

    GenericDao genericDao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(BikeRides.class);
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies gets all bikes rides successfully.
     */
    @Test
    void getBikeSuccess() {
        List<BikeRides> bikeRides = genericDao.getAll();
        assertEquals(6, bikeRides.size());
    }

    /**
     * Verifies a bike ride is returned correctly based on id search.
     */
    @Test
    void getByIdSuccess() {
        BikeRides retrievedBikeRide = (BikeRides) genericDao.getById(2);
        assertNotNull(retrievedBikeRide);
        assertEquals("Columbia County 7 Loop", retrievedBikeRide.getRideDescription());
    }
    /**
     * Verify successful insert of a bike ride
     */
    @Test
    void insertSuccess() {

        GenericDao localDao = new GenericDao(User.class);
        User user = (User)localDao.getById(3);
        BikeRides newBikeRide = new BikeRides(8,"Fall River to Columbus Round Trip",user);
        user.addBikeRide(newBikeRide);
        int id = genericDao.insert(newBikeRide);
        assertNotEquals(0,id);
        BikeRides insertedBikeRide = (BikeRides) genericDao.getById(id);
        assertEquals(newBikeRide, insertedBikeRide);

    }

    /**
     * Verify successful delete of bike ride tied to a user
     */
    @Test
    void deleteSuccess() {
        GenericDao localDao = new GenericDao(BikeRides.class);
        Object bikeRide = localDao.getById(2);
        genericDao.delete(bikeRide);
        assertNull(genericDao.getById(2));
    }
    /**
     * Verify successful update of bike ride
     */
    @Test
    void updateSuccess() {
        int newMilesRidden = 26;
        BikeRides bikeRideToUpdate = (BikeRides) genericDao.getById(2);
        bikeRideToUpdate.setMilesRidden(newMilesRidden);
        genericDao.saveOrUpdate(bikeRideToUpdate);
        BikeRides retrievedBikeRide = (BikeRides) genericDao.getById(2);
        assertEquals(bikeRideToUpdate, retrievedBikeRide);
    }
    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<BikeRides> bikeRides = genericDao.getByPropertyEqual("rideDescription",
                "Military Ridge Trail Round Trip");
        assertEquals(1, bikeRides.size());
        assertEquals(6, bikeRides.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<BikeRides> bikeRides = genericDao.getByPropertyLike("rideDescription", "C");
        assertEquals(2, bikeRides.size());
    }
}
