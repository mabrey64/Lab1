public class Product
{
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
}
