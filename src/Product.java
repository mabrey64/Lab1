public class Product
{
    private static int IDSeed = 0;
    private String ID;
    private String Name;
    private String Description;
    private double Cost;

    public Product(String ID, String Name, String Description, double Cost)
    {
        this.ID = ID;
        this.Name = Name;
        this.Description = Description;
        this.Cost = Cost;
    }

    @Override
    public String toString() {
        return ID + ", " + Name + ", " + Description + ", " + Cost;
    }

    public String toCSV() {
        return ID + "," + Name + "," + Description + "," + Cost + ",";
    }

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

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public static void setIDSeed(int IDSeed) {
        Product.IDSeed = IDSeed;
    }
}
