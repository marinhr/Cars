public abstract class Car
{
    private String brand;
    private String model;
    private String fuel;
    private int producYear;

    public Car(){}

    public Car(String brand, String model, String fuel, int producYear)
        {
            this.brand = brand;
            this.model = model;
            this.fuel = fuel;
            this.producYear = producYear;
        }
    @Override
    public String toString()
        {
        return "\n" +"Car{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", fuel='" + fuel + '\'' + ", producYear=" + producYear;
        }

    public String getBrand()
        {
        return brand;
        }

    @Override
    public boolean equals(Object obj)
        {
        return this.equals(obj);
        }
}