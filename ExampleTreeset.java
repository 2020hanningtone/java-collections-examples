package dataStructures;

import java.util.TreeSet;
import java.util.Set;

//sorted uniques elements
public class ExampleTreeset {
    public static void main(String[] args) {
        var cars = new TreeSet <String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); //Though duplicate it won't be printed
        cars.add("Mazda");


        // use set methods to organize the elements
       for (String i:cars){
           System.out.println(i);
       }

    }
}
