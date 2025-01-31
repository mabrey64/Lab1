/**
 * The Person class is used to create a person object with the following attributes
 * ID as int, FirstName & LastName as String, Title as String, and YOB as int
 * The IDSeed is a static variable that is used to generate a unique ID for each person object
 */
public class Person
{
    private String ID;
    private String FirstName;
    private String LastName;
    private String Title;
    private int YOB;

    /**
     * The constructor for the Person class
     * @param ID The ID of the person
     * @param FirstName The first name of the person
     * @param LastName The last name of the person
     * @param Title The title of the person
     * @param YOB The year of birth of the person
     */
    public Person (String ID, String FirstName, String LastName, String Title, int YOB)
    {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Title = Title;
        this.YOB = YOB;
    }

    /**
     * Another constructor for the Person class if the title is not provided
     * @param ID The ID of the person
     * @param FirstName The first name of the person
     * @param LastName The last name of the person
     * @param YOB The year of birth of the person
     */

    public Person (String ID, String FirstName, String LastName,  int YOB)
    {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.YOB = YOB;
    }

    /**
     * All the get methods are used to @return the value of the attribute
     */

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

    /**
     * All the set methods are used to set the value of the attribute. The @param is the value to set the attribute to.
     * @return The value of the attribute that was set.
     */
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


    /**
     * The toString method is used to convert the record into a string format
     * @return The record in a string format
     */
    @Override
    public String toString() {
        return ID + ", " + FirstName + ", " + LastName + ", " + Title + ", " + YOB;
    }

    /** toXML method is used to convert the record into an XML format
     * @return The record in an XML format
     */
    public String toXML() {
        return "<Person>\n" +
                "  <ID>" + ID + "</ID>\n" +
                "  <FirstName>" + FirstName + "</FirstName>\n" +
                "  <LastName>" + LastName + "</LastName>\n" +
                "  <Title>" + Title + "</Title>\n" +
                "  <YOB>" + YOB + "</YOB>\n" +
                "</Person>";
    }

    /** toJSON method is used to convert the record into a JSON format
     * @return The record in a JSON format
     */
    public String toJSON() {
        return "{\n" +
                "  \"ID\": \"" + ID + "\",\n" +
                "  \"FirstName\": \"" + FirstName + "\",\n" +
                "  \"LastName\": \"" + LastName + "\",\n" +
                "  \"Title\": \"" + Title + "\",\n" +
                "  \"YOB\": " + YOB + "\n" +
                "}";
    }

    /**
     * The toCSV method is used to convert the record into a CSV format
     * This isn't used as the ToString method is used to convert the record into a string format with a space in between the commas.
     * @return The record in a CSV format
     */
    public String toCSV() {
        return ID + ", " + FirstName + ", " + LastName + ", " + Title + ", " + YOB;
    }

    /**
     * The fullName method is used to return the full name of the person
     * @return The full name of the person
     */
    public String fullName()
    {
        return FirstName + " " + LastName;
    }

    /**
     * The formalName method is used to return the formal name of the person
     * @return The formal name of the person
     */
    public String formalName()
    {
        return Title + " " + LastName;
    }

    /**
     * The getAge method is used to return the age of the person
     * @return The age of the person
     */
    public String getAge()
    {
        int age = 2025 - YOB;
        return FirstName + " is " + age + " years old.";
    }

    /**
     * The getAge method is used to return the age of the person
     * @param year The year to calculate the age from
     * @return The age of the person
     */
    public String getAge(int year)
    {
        year = 2015;
        int age = year - YOB;
        return FirstName + " is " + (year - YOB) + " years old.";
    }
}
