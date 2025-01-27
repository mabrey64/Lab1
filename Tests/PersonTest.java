import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest
{
    Person p1, p2, p3, p4, p5;

    @BeforeEach
    void SetUp()
    {
        p1 = new Person("1", "John", "Doe", "Mr", 1980);
        p2 = new Person("2", "Jane", "Doe", "Mrs", 1985);
        Person.setIDSeed(0);
        p3 = new Person("3", "Jack", "Doe", "Dr", 1990);
        p4 = new Person("4", "Jill", "Doe", "Ms", 1995);
        p5 = new Person("5", "Jim", "Doe", "Prof", 2000);
    }

    void getIDSeed() {
        assertEquals(4, Person.getIDSeed());
    }

    @Test
    void getID()
    {
        assertEquals("1", p1.getID());
    }

    @Test
    void getFirstName()
    {
        assertEquals("John", p1.getFirstName());
    }

    @Test
    void getLastName()
    {
        assertEquals("Doe", p1.getLastName());
    }

    @Test
    void getTitle()
    {
        assertEquals("Mr", p1.getTitle());
    }

    @Test
    void setID()
    {

    }

    @Test
    void setFirstName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void setTitle() {
    }
}
