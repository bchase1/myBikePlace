package edu.matc.persistence;

import edu.matc.entity.User;
import edu.matc.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.sql.Timestamp;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {

    UserDao dao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {
        dao = new UserDao();
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies gets all users by successfully.
     */
    @Test
    void getUserSuccess() {
        List<User> users = dao.getUser();
        assertEquals(6, users.size());
    }

    /**
     * Verifies a user is returned correctly based on id search.
     */
    @Test
    void getByIdSuccess() {
        User retrievedUser = dao.getById(3);
        assertNotNull(retrievedUser);
        assertEquals("Barney", retrievedUser.getFirstName());
    }
    /**
     * Verify successful insert of a user
     */
    @Test
    void insertSuccess() {

        //Date object
        Date date= new Date();
        //getTime() returns current time in milliseconds
        long time = date.getTime();
        //Passed the milliseconds to constructor of Timestamp class
        Timestamp ts = new Timestamp(time);
        User newUser = new User(7, ts, "fflintstone@gmail.com", "Fred", "Flintstone", "supersecret7", ts, "fflintstone");
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = dao.getById(id);
        assertEquals(newUser, insertedUser);
    }

    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));
    }
    /**
     * Verify successful update of user
     */
    @Test
    void updateSuccess() {
        String newLastName = "Curry";
        User userToUpdate = dao.getById(3);
        userToUpdate.setLastName(newLastName);
        dao.saveOrUpdate(userToUpdate);
        User retrievedUser = dao.getById(3);
        assertEquals(newLastName, retrievedUser.getLastName());
    }
    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = dao.getByPropertyLike("lastName", "Curry");
        assertEquals(1, users.size());
        assertEquals(3, users.get(0).getUserId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = dao.getByPropertyLike("lastName", "c");
        assertEquals(3, users.size());
    }
}
