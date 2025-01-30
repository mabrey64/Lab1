/**
 * This program reads a file containing records of people and displays them in a formatted table.
 * The file must contain records in the following format:
 * ID, FirstName, LastName, Title, YOB
 * The program will display an error message if the record is not in the correct format.
 * This only reads .txt files (CSV) currently and can be expanded to read JSON and XML files.
 */

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.READ;

public class PersonReader
{
    public static void main(String[] args)
    {
        // Create a file chooser
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String record;

        //Try catches are made in case the file is not found, cannot be read, or some other error occurs
        try
        {
            // Set the current directory to the working directory
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                // Get the selected file
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                System.out.println("Selected file: " + file.toString());
                InputStream in = new BufferedInputStream(Files.newInputStream(file, READ));
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                // Display the table headers
                System.out.printf("%1s %10s %12s %8s %8s\n", "ID#", "Firstname", "Lastname", "Title", "YOB");
                System.out.println("=============================================");

                // Read the records from the file and display them under the table headers
                while ((record = reader.readLine()) != null)
                {
                    String[] Records = record.split(", ");
                    if (Records.length == 5) {
                        System.out.printf("%-6s %-10s %-12s %-8s %-4s\n", Records[0], Records[1], Records[2], Records[3], Records[4]);
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
