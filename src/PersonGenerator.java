import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> PersonList = new ArrayList<>();
        boolean finished;
        do
        {
            String ID = SafeInput.getNonZeroLenString(sc, "Enter the ID [6 digits] ");
            String FirstName = SafeInput.getNonZeroLenString(sc, "Enter their first name: ");
            String LastName = SafeInput.getNonZeroLenString(sc, "Enter their last name: ");
            String Title = SafeInput.getNonZeroLenString(sc, "Enter their title: ");
            int YOB = SafeInput.getRangedInt(sc, "Enter their year of birth: ", 1000, 9999);

            Person person = new Person(ID, FirstName, LastName, Title, YOB);
            PersonList.add(person);

            finished = SafeInput.getYNConfirm(sc, "Are you finished entering people? ");
        } while (!finished);
        try
        {
            System.out.println("Enter the name of the file that will hold the person list: ");
            String filename = sc.nextLine();
            Path file = Paths.get(filename + ".txt");
            try (BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
                for (Person person : PersonList) {
                    writer.write(person.toString());
                    writer.newLine();
                }
            }
            System.out.println("File has been written successfully.");
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
        for (Person person : PersonList)
        {
            System.out.println(person);
        }
    }
}
