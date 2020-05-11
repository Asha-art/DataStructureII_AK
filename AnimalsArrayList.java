import java.util.ArrayList;

public class AnimalsArrayList {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        // ArrayList animals = new ArrayList();
        animals.add("alpaca");
        animals.add("Elephant");
        animals.add("Dog");

        for (String i : animals) {
            System.out.println(i);
        }
        // using contains method without forEach iterator to check if favorite animal is
        // in the list and print
        boolean favAnimal = animals.contains("Elephant");

        if (favAnimal)
            System.out.println("I love Elephant");
        else
            System.out.println("NO, I don't care about those");

    }

}