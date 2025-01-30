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
import java.util.Scanner;

public class ProductWriter
{
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        ArrayList<Product> ProductList = new ArrayList<>();
        boolean finished;
        do
        {
            String ID = SafeInput.getNonZeroLenString(sca, "Enter the ID [6 digits] ");
            String Name = SafeInput.getNonZeroLenString(sca, "Enter the product name ");
            String Description = SafeInput.getNonZeroLenString(sca, "Enter the description of the product ");
            double Cost = SafeInput.getDouble(sca, "Enter the cost of the product ");

            Product product = new Product(ID, Name, Description, Cost);
            ProductList.add(product);

            finished = SafeInput.getYNConfirm(sca, "Are you finished entering products? ");
        } while (!finished);
        try
        {
            System.out.println("Enter the name of the files that will hold the product list: ");
            String filename = sca.nextLine();
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
