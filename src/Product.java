/**
 * The Product class is used to create a Product object. The Product object has the following attributes:
 * ID as int, Name as String, Description as String, Cost as double
 * IDSeed is a static variable that is used to generate a unique ID for each product object
 *
 */

public class Product
{
    private static int IDSeed = 0;
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
     * The toString method is used to return the value of the attributes as a string
     * @return The value of the attributes as a string
     */
    @Override
    public String toString() {
        return ID + ", " + Name + ", " + Description + ", " + Cost;
    }

    /**
     * The toCSV method is used to return the value of the attributes as a CSV string
     * @return The value of the attributes as a CSV string
     */
    public String toCSV() {
        return ID + "," + Name + "," + Description + "," + Cost + ",";
    }

    /**
     * All the get methods are used to @return the value of the attribute
     * @return The value of the attribute
     */
    public static int getIDSeed() {
        return IDSeed;
    }

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }

    public String getDescription() {
        return Description;
    }

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

    public String setDescription(String description) {
        return this.Description = description;
    }

    public double setCost(double cost) {
        return this.Cost = cost;
    }

    public static void setIDSeed(int IDSeed) {
        Product.IDSeed = IDSeed;
    }
}
