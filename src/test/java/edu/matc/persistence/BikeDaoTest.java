package edu.matc.persistence;

import edu.matc.entity.Bike;
import edu.matc.entity.User;
import edu.matc.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class BikeDaoTest {

    GenericDao genericDao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(Bike.class);
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies gets all bikes successfully.
     */
    @Test
    void getBikeSuccess() {
        List<Bike> bike = genericDao.getAll();
        assertEquals(6, bike.size());
    }

    /**
     * Verifies a bike is returned correctly based on id search.
     */
    @Test
    void getByIdSuccess() {
        Bike retrievedBike = (Bike) genericDao.getById(2);
        assertNotNull(retrievedBike);
        assertEquals("Robaix", retrievedBike.getBikeName());
    }
    /**
     * Verify successful insert of a bike
     */
    @Test
    void insertSuccess() {

        GenericDao localDao = new GenericDao(User.class);
        User user = (User)localDao.getById(3);
        Bike newBike = new Bike("2015","Trek","Domane","carbon wheels",user);
        user.addBike(newBike);
        int id = genericDao.insert(newBike);
        assertNotEquals(0,id);
        Bike insertedBike = (Bike)genericDao.getById(id);
        assertEquals(newBike, insertedBike);

    }

    /**
     * Verify successful delete of bike tied to a user
     */
    @Test
    void deleteSuccess() {
        GenericDao localDao = new GenericDao(Bike.class);
        Object bike = localDao.getById(2);
        genericDao.delete(bike);
        assertNull(genericDao.getById(2));
    }
    /**
     * Verify successful update of bike
     */
    @Test
    void updateSuccess() {
        String newBikeBrand = "Specialized";
        Bike bikeToUpdate = (Bike)genericDao.getById(3);
        bikeToUpdate.setBikeBrand(newBikeBrand);
        genericDao.saveOrUpdate(bikeToUpdate);
        Bike retrievedBike = (Bike)genericDao.getById(3);
        assertEquals(bikeToUpdate, retrievedBike);
    }
    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Bike> bikes = genericDao.getByPropertyEqual("bikeBrand", "Trek");
        assertEquals(4, bikes.size());
        assertEquals(1, bikes.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Bike> bikes = genericDao.getByPropertyLike("bikeBrand", "T");
        assertEquals(5, bikes.size());
    }
}