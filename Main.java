public class Main
{
    public static void main(String[] args)
        {
        System.out.println("Welcome to the main menu!\n" +
                "Click 1 to show all cars.\n" +
                "Click 2 to add new car.\n" +
                "Click 3 to delete a car");
        VehiclesManagement vm = new VehiclesManagement();
        Menu m = new Menu();
        m.showOptions();
        }
}
