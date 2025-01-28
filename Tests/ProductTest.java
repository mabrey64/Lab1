import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest
{
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

    @Test
    void testToCSV() {
        Product p = new Product("1", "Clive", "Greens", 1.0);
        String expected = "1,Clive,Greens,1.0";
        assertEquals(expected, p.toCSV());
    }

    void getIDSeed() {
        assertEquals(4, Product.getIDSeed());
    }

    void getID()
    {
        assertEquals("1", pr1.getID());
    }

    void getName()
    {
        assertEquals("Apple", pr1.getName());
    }

    void getDescription()
    {
        assertEquals("Fruit", pr1.getDescription());
    }

    void getCost()
    {
        assertEquals(1.0, pr1.getCost());
    }

    void setName()
    {
        pr1.setName("6");
        assertEquals("6", pr1.getName());
    }

    void setDescription()
    {
        pr1.setDescription("6");
        assertEquals("6", pr1.getDescription());
    }

    void setCost()
    {
        pr1.setCost(6.0);
        assertEquals(6.0, pr1.getCost());
    }

    void setIDSeed()
    {
        Product.setIDSeed(6);
        assertEquals(6, Product.getIDSeed());
    }
    
}
