/**
 * ProductTest is a JUnit test class for the Person class that tests all the methods in the Product class.
 * Currently, the tests are empty and need to be filled in.
 * So, setup data was created to test the methods in the Product class in isolation.
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest
{
    /**
     * Setup data for testing the Product class tests.
     */
    Product pr1, pr2, pr3, pr4, pr5;

    @BeforeEach
    void SetUp()
    {
        pr1 = new Product("1", "Apple", "Fruit", 1.0);
        pr2 = new Product("2", "Banana", "Fruit", 2.0);
        Product.setIDSeed(0);
        pr3 = new Product("3", "Cherry", "Fruit", 3.0);
        pr4 = new Product("4", "Date", "Fruit", 4.0);
        pr5 = new Product("5", "Elderberry", "Fruit", 5.0);
    }

    /**
     * Test the toCSV method in the Product class.
     */
    @Test
    void testToCSV() {
        Product p = new Product("1", "Clive", "Greens", 1.0);
        String expected = "1,Clive,Greens,1.0";
        assertEquals(expected, p.toCSV());
    }

    /**
     * Test the getIDSeed method in the Product class.
     */
    @Test
    void getIDSeed() {
        assertEquals(4, Product.getIDSeed());
    }

    /**
     * Test the getID method in the Product class.
     */
    @Test
    void getID()
    {
        assertEquals("1", pr1.getID());
    }

    /**
     * Test the getName method in the Product class.
     */
    @Test
    void getName()
    {
        assertEquals("Apple", pr1.getName());
    }

    /**
     * Test the getDescription method in the Product class.
     */
    @Test
    void getDescription()
    {
        assertEquals("Fruit", pr1.getDescription());
    }

    /**
     * Test the getCost method in the Product class.
     */
    @Test
    void getCost()
    {
        assertEquals(1.0, pr1.getCost());
    }

    /**
     * Test the setID method in the Product class.
     */
    @Test
    void setName()
    {
        pr1.setName("6");
        assertEquals("6", pr1.getName());
    }

    /**
     * Test the setDescription method in the Product class.
     */
    @Test
    void setDescription()
    {
        pr1.setDescription("6");
        assertEquals("6", pr1.getDescription());
    }

    /**
     * Test the setCost method in the Product class.
     */
    @Test
    void setCost()
    {
        pr1.setCost(6.0);
        assertEquals(6.0, pr1.getCost());
    }

    /**
     * Test the setIDSeed method in the Product class.
     */
    @Test
    void setIDSeed()
    {
        Product.setIDSeed(6);
        assertEquals(6, Product.getIDSeed());
    }

}
