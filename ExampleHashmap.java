package dataStructures;

import java.util.HashMap;

//key-value pairs
public class ExampleHashmap {
    public static void main(String[] args) {
        //Create a HashMap Object called capitalCities
        HashMap <String, String > capitalCities = new HashMap<>();
        capitalCities.put("England" , "London");
        capitalCities.put("India" , "New Dehhli");
        capitalCities.put("Australia" , "Wien");
        capitalCities.put("Norway" , "Oslo");
        capitalCities.put("USA" , "Washington DC");
        capitalCities.put("Norway" , "Oslo");

        //Print Keys
        System.out.println("Get only keys:");
        for (String i : capitalCities.keySet()){
            System.out.println(i);
        }
        System.out.println();

        //Print values
        System.out.println("Get only values:");
        for (String i : capitalCities.values()){
            System.out.println(i);
        }
        System.out.println();

        //Print Keys and values
        System.out.println("Get both keys and values:");
         for (String i : capitalCities.keySet()) {
            System.out.println("Keys: " + i + " Values: " + capitalCities.get(i));
        }
    }
}
