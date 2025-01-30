/**
 * This class is used to generate a list of people and write them to a file.
 * The user is prompted to enter the ID, first name, last name, title, and year of birth of each person.
 * The program will then display the formal name, full name, age in the current year, and age in 2015 of each person.
 * The user is then prompted to enter the name of the file that will hold the person list.
 * The program will write the person list to a .txt file (within the CSV format), a .json file, and a .xml file.
 * The program will then display the person list after saving the files.
 */

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
            int YOB = SafeInput.getRangedInt(sc, "Enter their year of birth: ", 1940, 2025);

            Person person = new Person(ID, FirstName, LastName, Title, YOB);
            PersonList.add(person);

            System.out.println("This person's formal name is: " + person.formalName());
            System.out.println("This person's full name is: " + person.fullName());
            System.out.println("This person's age is: " + person.getAge());
            System.out.println("This peron's age when it was 2015 is: " + person.getAge(2015));

            finished = SafeInput.getYNConfirm(sc, "Are you finished entering people? ");
        } while (!finished);
        try
        {
            System.out.println("Enter the name of the files that will hold the person list: ");
            String filename = sc.nextLine();
            Path file = Paths.get(filename + ".txt");
            Path file2 = Paths.get(filename + ".json");
            Path file3 = Paths.get(filename + ".xml");
            try (BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
                for (Person person : PersonList) {
                    writer.write(person.toCSV());
                    writer.newLine();

                }
            }
            try (BufferedWriter writer = Files.newBufferedWriter(file2, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
                for (Person person : PersonList) {
                    writer.write(person.toJSON());
                    writer.newLine();

                }
            }
            try (BufferedWriter writer = Files.newBufferedWriter(file3, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
                for (Person person : PersonList) {
                    writer.write(person.toXML());
                    writer.newLine();

                }
            }
            System.out.println("Files has been written successfully.");
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
