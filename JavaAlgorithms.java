package dataStructures;
import java.util.*;
public class JavaAlgorithms {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Naomi"); names.add("Aziel"); names.add("Nahan");
        names.add("James"); names.add("Hanningtone");

        //Must be sorted first
        Collections.sort(names);
        System.out.println("Original names; ");

        //Iterating through the ArrayList using iterator method
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();// consume next line
        //binarySearch()
        int index = Collections.binarySearch(names, "Nahan");
        System.out.println("Nahan is at index: " + index);
    }
}
