public class CarAddedAfterwords extends Car
{
    private double price;
    public CarAddedAfterwords(String brand, String model, String fuel, int producYear)
        {
        super(brand, model, fuel, producYear);
        this.price = price;
        }

    @Override
    public String toString()
        {
        return "CarAddedAfterwords{" + "price=" + price + '}';
        }
}
