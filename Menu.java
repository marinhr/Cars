import java.util.Scanner;

public class Menu
{

    public Menu(){}

    Scanner in = new Scanner(System.in);
    int choice = in.nextInt();

    public void showOptions()
        {
        VehiclesManagement vm = new VehiclesManagement();
        vm.addVehicles();
        switch (choice)
            {
            case 1:
               System.out.println(vm.listOfCars);
                break;
            case 2:
                vm.addNewVehicle();
                System.out.println(vm.listOfCars);
                break;
//            case 3:
//                vm.deleteVehicle();
//                System.out.println(vm.listOfCars);
//                break;
//            case 4:
//                System.out.println("Proj Management");
//                break;

            default:
                System.out.println("Invalid choice");
            }
        }
}

