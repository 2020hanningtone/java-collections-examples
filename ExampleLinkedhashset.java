package dataStructures;

import java.util.LinkedHashSet;
//Allows no duplicates
//keeps the original insertion order
public class ExampleLinkedhashset {
    public static void main(String[] args) {
        LinkedHashSet <String> cars = new LinkedHashSet<>();
        cars.add("Mazda");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");//though duplicates set does not allow any duplicates won't be printed
        cars.add("Volvo");

        //for-each loop
        for (String h : cars){
            System.out.println(h);
        }
        //use set methods to organize the set
    }
}
