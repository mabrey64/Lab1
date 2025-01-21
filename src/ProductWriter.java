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
            System.out.println("Enter the name of the file that will hold the product list: ");
            String filename = sca.nextLine();
            Path file = Paths.get(filename + ".txt");
            try (BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
                for (Product product : ProductList) {
                    writer.write(product.toString());
                    writer.newLine();
                }
            }
            System.out.println("File has been written successfully.");
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
