public class Skoda extends Car
{
    private double price;
    public Skoda(String brand, String model, String fuel, int producYear, double price)
    {
    super(brand, model, fuel, producYear);
    this.price = price;
    }

    @Override
    public String toString()
        {
        return super.toString() + " price=" + price + '}';
        }
}
