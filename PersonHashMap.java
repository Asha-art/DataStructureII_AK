import java.util.*;

public class PersonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> person = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String name = "";
        String age = "";
        String town = "";
        String food = "";

        System.out.print("Enter your Name: ");
        String inputName = scanner.next();
        person.put("name", inputName);

        System.out.print("Enter your Age: ");
        String inputAge = scanner.next();
        person.put("age", inputAge);

        System.out.print("Enter your Hometown: ");
        String inputTown = scanner.next();
        person.put("town", inputTown);

        System.out.print("Enter your favorite food: ");
        String inputFood = scanner.next();
        person.put("food", inputFood);
        // Displaying the HashMap
        // System.out.println("values added: " + person.values());
        // Getting a Set of Key-value pairs
        // Set list = person.entrySet();
        // for (Map.Entry<String, String> entry : person.entrySet()) {
        // String key = entry.getKey();
        // String value = entry.getValue();
        // if
        // System.out.println("This is:" + value);

        // }
        for (String i : person.keySet()) {
            System.out.println("This is " + person.get(i) + " and their age " + person.get(i) + " from " + person.get(i)
                    + " and their favorite food is " + person.get(i));
            // System.out.println("This is " + inputName + " and they are " + inputAge + "
            // years old " + "from "
            // + inputTown + " and their favorite food is " + inputFood);
        }

        // System.out.println("This is " + inputName + " and they are " + inputAge + "
        // years old " + "from " + inputTown
        // + " and their favorite food is " + inputFood);

    }
}