package edu.matc.persistence;

import edu.matc.entity.Bike;
import edu.matc.entity.User;
import edu.matc.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
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
     * Verifies gets all bikes by successfully.
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
        Bike newBike = new Bike("2015","Trek","Domane","carbon wheels",2);
        Bike retrievedBike = (Bike) genericDao.getById(3);
        assertNotNull(retrievedBike);
        assertEquals("Trek", retrievedBike.getBikeBrand("Trek"));
    }
    /**
     * Verify successful insert of a bike
     */
    @Test
    void insertSuccess() {

        User newBike = new Bike("2015","Trek","Domane","carbon wheels",2);
        int id = genericDao.insert(newBike);
        assertNotEquals(0,id);
        User insertedBike = (User)genericDao.getById(id);
        assertEquals(newBike, insertedBike);
        // TODO review .equals recommendations http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#mapping-model-pojo-equalshashcode
    }

    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(3));
        assertNull(genericDao.getById(3));
    }
    /**
     * Verify successful update of user
     */
    @Test
    void updateSuccess() {
        String newBikeBrand = "Trek";
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
        List<Bike> bikes = genericDao.getByPropertyLike("bikeBrand", "Trek");
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