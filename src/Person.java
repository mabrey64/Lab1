import java.util.Calendar;

public class Person
{
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
