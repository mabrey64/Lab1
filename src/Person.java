import java.util.Calendar;

public class Person
{
    private static int IDSeed = 0;
    private String ID;
    private String FirstName;
    private String LastName;
    private String Title;
    private int YOB;

    public Person (String ID, String FirstName, String LastName, String Title, int YOB)
    {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Title = Title;
        this.YOB = YOB;
    }

    public static int getIDSeed() {
        return IDSeed;
    }

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getTitle() {
        return Title;
    }

    public int getYOB() {
        return YOB;
    }

    public String setFirstName(String FirstName) {
        return this.FirstName = FirstName;
    }

    public String setLastName(String LastName) {
        return this.LastName = LastName;
    }

    public String setTitle(String Title) {
        return this.Title = Title;
    }

    public int setYOB(int YOB) {
        return this.YOB = YOB;
    }

    public static void setIDSeed(int IDSeed) {
        Person.IDSeed = IDSeed;
    }


    @Override
    public String toString() {
        return ID + ", " + FirstName + ", " + LastName + ", " + Title + ", " + YOB;
    }

    public String fullName()
    {
        return FirstName + " " + LastName;
    }

    public String formalName()
    {
        return Title + " " + LastName;
    }

    public String getAge()
    {
        int age = 2025 - YOB;
        return FirstName + " is " + age + " years old.";
    }

    public String getAge(int year)
    {
        Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        return FirstName + " is " + (year - YOB) + " years old.";
    }
}
