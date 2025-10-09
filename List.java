package dataStructures;
//import the ArrayList class
import java.util.ArrayList;

//Ordered list and allows duplicates
public class List {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        //Add the elements
        cars.add("Harrier");
        cars.add("Tx");
        cars.add("AOUDI");
        cars.add("Mazda");

        //add element at a specified index
        cars.add(2, "Rolls roy");
        System.out.println("original list:");
        for (String car : cars){
            System.out.println(car);
        }
        //Replaces the element at the specified position
        cars.set(0,"Toyota");

        //Removes the element at the specified index
        cars.remove(4);

        //Returns element at the specified index
        System.out.println("Element at index 2 is " + cars.get(2));

        //for each loop
        System.out.println("Updated list is:");
        for (String car : cars){
            System.out.println(car);
        }
        System.out.println("The size of the arrayList is " + cars.size());

       // System.out.println("original cars:" + cars);
       // System.out.println("Updated Cars:" + cars);
        //get the size of the list

        // Normal for loop
       /* for (int i = 0 ; i < cars.size() ; i++){
            System.out.println(cars.get(i));
        }*/

    }


}
