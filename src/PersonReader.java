import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.READ;

public class PersonReader
{
    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String record;

        try
        {
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                System.out.println("Selected file: " + file.toString());
                InputStream in = new BufferedInputStream(Files.newInputStream(file, READ));
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                System.out.printf("%1s %10s %12s %8s %8s\n", "ID#", "Firstname", "Lastname", "Title", "YOB");
                System.out.println("=============================================");

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
