/**
 * PersonTest is a JUnit test class for the Person class that tests all the methods in the Person class.
 * Currently, the tests are empty and need to be filled in.
 * So, setup data was created to test the methods in the Person class in isolation.
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest
{
    /**
     * Setup data for testing the Person class tests.
     */
    Person p1, p2, p3, p4, p5;

    @BeforeEach
    void SetUp()
    {
        p1 = new Person("1", "John", "Doe", "Mr.", 1980);
        p2 = new Person("2", "Jane", "Doe", "Mrs.", 1985);
        Person.setIDSeed(0);
        p3 = new Person("3", "Jack", "Doe", "Dr.", 1990);
        p4 = new Person("4", "Jill", "Doe", "Ms.", 1995);
        p5 = new Person("5", "Jim", "Doe", "Prof.", 2000);
    }

    /**
     * Test the toCSV method in the Person class.
     */
    @Test
    void testToCSV() {
        Person p = new Person("1", "Johnny", "Dee", "Mr", 1988);
        String expected = "1,Johnny,Dee,Mr,1988";
        assertEquals(expected, p.toCSV());
    }

    /**
     * Test the getIDSeed method in the Person class.
     */
    void getIDSeed() {
        assertEquals(4, Person.getIDSeed());
    }

    /**
     * Test the getID method in the Person class.
     */
    @Test
    void getID()
    {
        assertEquals("1", p1.getID());
    }

    /**
     * Test the getFirstName method in the Person class.
     */
    @Test
    void getFirstName()
    {
        assertEquals("John", p1.getFirstName());
    }

    /**
     * Test the getLastName method in the Person class.
     */
    @Test
    void getLastName()
    {
        assertEquals("Doe", p1.getLastName());
    }

    /**
     * Test the getTitle method in the Person class.
     */
    @Test
    void getTitle()
    {
        assertEquals("Mr", p1.getTitle());
    }

    /**
     * Test the getYOB method in the Person class.
     */
    @Test
    void getYOB()
    {
        assertEquals(1980, p1.getYOB());
    }

    /**
     * Test the setID method in the Person class.
     */
    @Test
    void setFirstName()
    {
        p1.setFirstName("Johnny");
        assertEquals("Johnny", p1.getFirstName());
    }

    /**
     * Test the setID method in the Person class.
     */
    @Test
    void setLastName()
    {
        p1.setLastName("Dee");
        assertEquals("Dee", p1.getLastName());
    }

    /**
     * Test the setID method in the Person class.
     */
    @Test
    void setTitle()
    {
        p1.setTitle("Dr");
        assertEquals("Dr", p1.getTitle());
    }

    /**
     * Test the setID method in the Person class.
     */
    @Test
    void setYOB()
    {
        p1.setYOB(1988);
        assertEquals(1988, p1.getYOB());
    }

    /**
     * Test the setID method in the Person class.
     */
    @Test
    void setIDSeed()
    {
        Person.setIDSeed(6);
        assertEquals(6, Person.getIDSeed());
    }

    /**
     * Test the getAge method in the Person class.
     */
    @Test
    void getAge()
    {
        assertEquals("41", p1.getAge());
    }

    /**
     * Test the fullName  in the Person class.
     */
    @Test
    void fullName()
    {
        assertEquals("John is 45 years old.", p1.fullName());
    }

    /**
     * Test the formalName method in the Person class.
     */
    @Test
    void formalName()
    {
        assertEquals("Mr. Doe", p1.formalName());
    }
}
