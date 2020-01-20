import java.util.*;

public class VehiclesManagement
{
    ArrayList<Car> listOfCars = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addVehicles()
        {
            Vw vw = new Vw("Vw", "Passat CC", "Diesel", 2009, 10000);
            listOfCars.add(vw);
            Audi audi = new Audi("Audi", "80", "Diesel", 1993, 5000);
            listOfCars.add(audi);
            Skoda skoda = new Skoda ("Skoda", "Superb", "Diesel", 2014, 20000);
            listOfCars.add(skoda);
            Toyota toyota = new Toyota ("Toyota", "Rav 4", "Diesel", 2006, 12500);
            listOfCars.add(toyota);
        }

    public void addNewVehicle()
        {
            CarAddedAfterwords newCar = new CarAddedAfterwords(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
            listOfCars.add(newCar);
        }

//    public void deleteVehicle()
//        {
//            for (Car car : listOfCars){
//                String carToDelete = scanner.nextLine();
//                listOfCars.removeIf(brand -> brand.equals(carToDelete));
//                if(listOfCars.contains(carToDelete));
//                listOfCars.remove(carToDelete);
//                break;
//            }
//        }
}
