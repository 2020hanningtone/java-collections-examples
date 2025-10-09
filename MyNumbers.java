package dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MyNumbers {
    public static void main(String[] args) {
        //create a list of numbers
        //ArrayList<Integer> numbers = new ArrayList<>();// Normal way to write list
       // var numbers = new ArrayList<Integer>();// short version using var keyword
        List<Integer> numbers = new ArrayList<>();
        numbers.add(18);
        numbers.add(5);
        numbers.add(20);
        numbers.add(11);
        numbers.add(2);



        System.out.println("Original list: ");

        //for each with lambda expression
        numbers.forEach(numb -> System.out.println(numb));

        System.out.println("Updated List: ");
        Collections.sort(numbers);
        //,Collections.reverseOrder() reverses from descending to ascending


        //for Each loop
      /* for (int i : numbers){
            System.out.println(i);
        }*/

        //Normal for loop
        for (int h = 0 ; h < numbers.size() ; h++){
            System.out.println(numbers.get(h));
        }

    }
}
