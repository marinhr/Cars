public class Audi extends Car
{
    private double price;
    public Audi(String brand, String model, String fuel, int producYear, double price)
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
