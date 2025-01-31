/**
 * The Product class is used to create a Product object. The Product object has the following attributes:
 * ID as int, Name as String, Description as String, Cost as double
 * IDSeed is a static variable that is used to generate a unique ID for each product object
 */

public class Product
{
    private String ID;
    private String Name;
    private String Description;
    private double Cost;

    /**
     * The constructor for the Product class
     * @param ID The ID of the product
     * @param Name The name of the product
     * @param Description The description of the product
     * @param Cost The cost of the product
     */
    public Product(String ID, String Name, String Description, double Cost)
    {
        this.ID = ID;
        this.Name = Name;
        this.Description = Description;
        this.Cost = Cost;
    }

    /**
     * The constructor for the Product class if the cost is not provided
     * @param ID The ID of the product
     * @param Name The name of the product
     * @param Description The description of the product
     */

    public Product(String ID, String Name, String Description)
    {
        this.ID = ID;
        this.Name = Name;
        this.Description = Description;
    }

    /**
     * The toString method is used to return the value of the attributes as a string
     * @return The value of the attributes as a string
     */
    @Override
    public String toString() {
        return ID + ", " + Name + ", " + Description + ", " + Cost;
    }

    /**
     * ToXML method is used to return the value of the attributes as an XML string
     * @return The value of the attributes as an XML string
     */
    public String toXML() {
        return "<Product>\n" +
                "  <ID>" + ID + "</ID>\n" +
                "  <Name>" + Name + "</Name>\n" +
                "  <Description>" + Description + "</Description>\n" +
                "  <Cost>" + Cost + "</Cost>\n" +
                "</Product>";
    }

    /**
     * The toJSON method is used to return the value of the attributes as a JSON string
     * @return The value of the attributes as a JSON string
     */
    public String toJSON() {
        return "{\n" +
                "  \"ID\": \"" + ID + "\",\n" +
                "  \"Name\": \"" + Name + "\",\n" +
                "  \"Description\": \"" + Description + "\",\n" +
                "  \"Cost\": " + Cost + "\n" +
                "}";
    }


    /**
     * The toCSV method is used to return the value of the attributes as a CSV string
     * This method isn't used as the toString method is used to return the value of the attributes as a string with a space in between the commas.
     * @return The value of the attributes as a CSV string
     */
    public String toCSV() {
        return ID + ", " + Name + ", " + Description + ", " + Cost;
    }


    /**
     * All the get methods are used to return the value of the attribute.
     * @return The value of the attribute.
     */
    public String getName() {
        return Name;
    }

    /**
     * The getID method is used to return the value of the ID attribute
     * @return The value of the ID attribute
     */
    public String getID() {
        return ID;
    }

    /**
     * The getDescription method is used to return the value of the Description attribute
     * @return The value of the Description attribute
     */
    public String getDescription() {
        return Description;
    }

    /**
     * The getCost method is used to return the value of the Cost attribute
     * @return The value of the Cost attribute
     */
    public double getCost() {
        return Cost;
    }

    /**
     * All the set methods are used to set the value of the attribute. The @param is the value to set the attribute to.
     * @return The value of the attribute that was set.
     */
    public String setName(String name) {
        return this.Name = name;
    }

    /**
     * The setID method is used to set the value of the ID attribute
     * @return The value of the ID attribute that was set
     */
    public String setDescription(String description) {
        return this.Description = description;
    }

    /**
     * The setCost method is used to set the value of the Cost attribute
     * @return The value of the Cost attribute that was set
     */
    public double setCost(double cost) {
        return this.Cost = cost;
    }

}
