package dataStructures;
//import the HashSet class
import java.util.HashSet;
//unordered and every element is unique
public class ExampleHashset {
    public static void main(String[] args) {

        //and elements to the set
        HashSet<String > cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");//Duplicate
        cars.add("Mazda");

        //remove()
        cars.remove( "Ford");

        System.out.println("Original cars list:");
        // for each loop
        for (String i : cars){
            System.out.println(i);
        }
        //Check if elements exist contains()
       System.out.println(cars.contains("Mazda") + ": The car list contains Mazda");
        System.out.println("The size is: " + cars.size());
    }
}
