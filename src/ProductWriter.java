/**
 * This class is used to write the product list to a file.
 * The user is prompted to enter the ID, name, description, and cost of each product.
 * The program will then display the product list and write it to a .txt file (within the CSV format), a .json file, and a .xml file.
 * The program will then display the product list after saving the files.
 * The program will display an error message if the record is not in the correct format.
 *
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ProductWriter
{

    public static void main(String[] args)
    {
        /**
         * The variables are initialized to hold the filename, pattern, and prompt.
         * This is used for the RegEx string validation.
         */
        String filename = "document";
        String pattern = "\\A(?!\\s*\\Z).+";
        String prompt = "Enter the name of the file that will hold the product list: ";

        /**
         * The SafeInputObj is created to handle the input validation.
         * The ProductList is created to hold the list of products.
         */
        SafeInputObj safeInputObj = new SafeInputObj();
        ArrayList<Product> ProductList = new ArrayList<>();
        boolean finished;
        do
        {
            /**
             * The user is prompted to enter the ID, name, description, and cost of each product.
             */
            String ID = safeInputObj.getNonZeroLenString("Enter the ID [6 digits] ");
            String Name = safeInputObj.getNonZeroLenString("Enter the product name ");
            String Description = safeInputObj.getNonZeroLenString("Enter the description of the product ");
            double Cost = safeInputObj.getDouble("Enter the cost of the product ");

            /**
             * The product is created and added to the arrayList ProductList.
             */
            Product product = new Product(ID, Name, Description, Cost);
            ProductList.add(product);

            finished = safeInputObj.getYNConfirm("Are you finished entering products? ");
        } while (!finished);
        try
        {
            /**
             * The user is prompted to enter the name of the file that will hold the product list.
             * The program will write the product list to a .txt file (within the CSV format), a .json file, and a .xml file.
             */
            filename = safeInputObj.getRegExString(prompt, pattern);
            Path file = Paths.get(filename + ".txt");
            Path file2 = Paths.get(filename + ".json");
            Path file3 = Paths.get(filename + ".xml");
            try (BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
                for (Product product : ProductList) {
                    writer.write(product.toString());
                    writer.newLine();
                }
            }
            try (BufferedWriter writer = Files.newBufferedWriter(file2, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
                for (Product product : ProductList) {
                    writer.write(product.toJSON());
                    writer.newLine();

                }
            }
            try (BufferedWriter writer = Files.newBufferedWriter(file3, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
                for (Product product : ProductList) {
                    writer.write(product.toXML());
                    writer.newLine();

                }
            }
            System.out.println("Files has been written successfully.");
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
        for (Product product : ProductList)
        {
            System.out.println(product);
        }
    }
}
