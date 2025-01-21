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
}
