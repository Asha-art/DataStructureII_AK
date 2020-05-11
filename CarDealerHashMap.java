
// Exercise 2 - Car Dealer
// 1. Create a HashMap of vehicles with the model as the Key and the make as the Value
// 2. Ask the customer what car (model) they are looking for
// 3. Determine if you have that vehicle and get the make 
// 4. Return a string to the customer (something like "Oh, you're looking for a Civic? Our Honda selection is right over here!")
import java.util.*;

public class CarDealerHashMap {
    public static void main(String[] args) {
        HashMap<String, String> cars = new HashMap<>();
        cars.put("civic", "honda");
        cars.put("camry", "toyota");
        cars.put("roadster", "tesla");
        cars.put("e-tron", "audi");
        cars.put("ux", "lexus");

        boolean choice = true;

        do {

            System.out.println("What car model are you looking for? ");
            Scanner scanner = new Scanner(System.in);
            String model = scanner.nextLine();

            String val = cars.get(model.toLowerCase());

            if (cars.containsKey(model.toLowerCase())) {

                System.out.printf(
                        "oh, you are looking for a " + model + ", Our " + val + " selection is right over here  ");
            } else {
                System.out.println("sorry, We dont have that model of the car");
            }
            System.out.println("\nDo you want to check different model? y/n?");
            String check = scanner.next();
            if (check.equalsIgnoreCase("y")) {
                choice = true;
            } else
                choice = false;

        } while (choice);

        System.out.printf("Thank you for visiting");

    }
}