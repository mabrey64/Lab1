/**
 * This program reads a file containing product records and displays them in a table format.
 * The file must contain records in the following format:
 * ID, Name, Description, Cost
 * The program will display an error message if the record is not in the correct format.
 * This only reads .txt files (CSV) currently and can be expanded to read JSON and XML files.
 */

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardOpenOption.READ;

public class ProductReader
{
    public static void main(String[] args)
    {
        /**
         * Create a file chooser
          */

        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String record;

        /**
         * Try catches are made in case the file is not found, cannot be read, or some other error occurs
         */

        try
        {
            /**
             * Set the current directory to the working directory
             */

            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                /**
                 * Get the selected file
                 */

                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                System.out.println("Selected file: " + file.toString());
                InputStream in = new BufferedInputStream(Files.newInputStream(file, READ));
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                /**
                 * Display the table headers
                 */

                System.out.printf("%1s %7s %15s %9s\n", "ID#", "Name", "Description", "Cost");
                System.out.println("========================================");

                /**
                 * Read the records from the file and display them under the table headers
                  */

                while ((record = reader.readLine()) != null)
                {
                    String[] Records = record.split(", ");
                    if (Records.length == 4) {
                        double cost = Double.parseDouble(Records[3]);
                        System.out.printf("%-6s %-4s %-10s %-6s\n", Records[0], Records[1], Records[2], cost);
                    } else {
                        System.out.println("Invalid record format: " + record);
                    }
                }
                reader.close();
                System.out.println("\n\nThe file has been read");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("The selected file was not found");
        }
        catch (IOException e)
        {
            System.out.println("An error has occurred");
        }
    }
}
