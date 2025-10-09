package dataStructures;
//import the LinkedHashMap class
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

//Stores keys and values and keeps them in the same order you put them
public class ExampleLinkedHashmap {
    public static void main(String[] args) {
        //create an object of LiinkedHashMap
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

        //add elements to the collection
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Australia", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo");//duplicate will not appear
        capitalCities.put("USA", "Washington DC");

        //how to use a normal for each loop rather using iterator
        System.out.println("\nHere I'm using a normal for-each loop:");
        for (String i : capitalCities.keySet()){
            System.out.println("Keys:" + i + " ->Values:  " + capitalCities.get(i));
        }
        System.out.println();

        // Print keys only
        System.out.println("Print keys only:");
       Iterator<String> it = capitalCities.keySet().iterator();
        while (it.hasNext()){
            System.out.println("Keys: " + it.next());
        }
        System.out.println();

        //Print values only
        System.out.println("Print values only:");
       Iterator<String> val = capitalCities.values().iterator();
        while (val.hasNext()){
            System.out.println("Values: " + val.next() );
        }
        System.out.println();

        //print both keys and values
        System.out.println("Print both keys and values:");
        Iterator<Map.Entry<String, String>> iter = capitalCities.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String,String> entry = iter.next();
            System.out.println("Keys:" + entry.getKey() + " -> Values: " + entry.getValue());
            if (entry.getKey().equals("Norway")){
                iter.remove();
                System.out.println("Norway removed successfully");
            }
        }
        System.out.println("\nAfter removal");
        for (Map.Entry<String, String>  entry : capitalCities.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }




    }
}
