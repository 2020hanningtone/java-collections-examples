package dataStructures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
// Demonstrating the use of Iterator
public class ExampleIterator {
    public static void main(String[] args) {
        //create A collection of ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);numbers.add(8); numbers.add(2);numbers.add(18);
        numbers.add(36);numbers.add(5);numbers.add(20);numbers.add(46);

        //Sorts Ascending to descending order
        Collections.sort(numbers);

        System.out.println("Before filtering");
        for (Integer numb : numbers){
            System.out.println(numb);
        }
        System.out.println();

        //Get the Iterator
        Iterator<Integer> it = numbers.iterator();
        //Use iterator to remove numbers that
        // are less than 10 from the collections
        while (it.hasNext()){
            Integer i = it.next();
            if (i < 10){
                it.remove(); } }

        System.out.println("After filtering numbers less than 10:");
        for (Integer num : numbers){
            System.out.println(num);
        } } }
