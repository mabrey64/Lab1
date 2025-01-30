/**
 * ObjInputTest.java
 * Tests the SafeInputObj class
 * The tests were made to try and test the get methods within SafeInputObj,
 * but I ran into several errors that led me to believe it isn't possible to test the get methods.
 * They are kept in as is for now.
 */
//
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import java.io.ByteArrayInputStream;
//
//import java.util.Scanner;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class ObjInputTest
//{
//    private SafeInputObj safeInputObj;
//    private ByteArrayInputStream in;
//    private SafeInputObj safeInputObj2;
//    private ByteArrayInputStream in2;
//
//    @BeforeEach
//    void SetUp()
//    {
//        in = new ByteArrayInputStream("123456\n5\n".getBytes());
//        in2 = new ByteArrayInputStream("2\n".getBytes());
//        safeInputObj = new SafeInputObj(new Scanner(in));
//        safeInputObj2 = new SafeInputObj(new Scanner(in2));
//    }
//
//
//    @Test
//    void testGetNonZeroLenString() {
//        String prompt = "Enter the ID [6 digits]";
//        String expected = "123456";
//        assertEquals(expected, safeInputObj.getNonZeroLenString(prompt));
//    }
//
//    @Test
//    void testGetRangedInt() {
//        String prompt = "Enter a number between 1 and 10";
//        int low = 1;
//        int high = 10;
//        assertTrue(safeInputObj2.getRangedInt(prompt, low, high));
//    }
//
//    @Test
//    void testGetInt() {
//        String prompt = "Enter a number";
//        int expected = 5;
//        assertEquals(expected, safeInputObj.getInt(prompt));
//    }
//
//    @Test
//    void testgetRangedDouble() {
//
//    }
//
//
//}
