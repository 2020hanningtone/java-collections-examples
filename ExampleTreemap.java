package dataStructures;
//import  the TreeMap class
import java.util.TreeMap;

//TreeMap stores key/values in sorted order
public class ExampleTreemap {
    public static void main(String[] args) {
        //Create TreeMap object to hold string keys and string values
        TreeMap<String, String > capitalCities = new TreeMap<>();

        // add items
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Ethiopia", "Addis Ababa");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("Rwanda", "Kigali");
        capitalCities.put("Burundi", "Bujumbura");
        capitalCities.put("South Sudan", "Juba");
        capitalCities.put("Somalia", "Mogadishu");
        capitalCities.put("Eritrea","Asmara");
        capitalCities.put("Mozambique", "Maputo");
        capitalCities.put("Madagascar", "Antananarivo");
        System.out.println();

        //Loop through a TreeMap
        System.out.println("The original list of capital cities:");
        for (String i : capitalCities.keySet()){
            System.out.println("Keys: " + i + " Values: " + capitalCities.get(i));
        }
        System.out.println();

        //let's use the map methods to manage the list
        //the size of keys/values
        System.out.println("The size of the list is " + capitalCities.size());

        //Access an item
        System.out.println("Unique key for Eritrea is " + capitalCities.get("Eritrea"));
        System.out.println();

        //remove()
        System.out.println("Updated list after removal (removed South Sudan)");
        capitalCities.remove("South Sudan");
        System.out.println("South Sudan has been removed successfully");
        for (String i : capitalCities.keySet()){
            System.out.println("Keys : " + i + " Values: " + capitalCities.get(i));
        }
        System.out.println("The size of the list is " + capitalCities.size());
        System.out.println();
        // clear(): removes all the items
        System.out.println("Nothing remains after clear() method is used");
        capitalCities.clear();
        for (String i : capitalCities.keySet()){
            System.out.println("Keys : " + i + " Values: " + capitalCities.get(i));

        }
        System.out.println("The size of the list is " + capitalCities.size());
    }
}
