package dataStructures;
import java.util.LinkedList;
import java.util.List;
public class ExapleLinked {
    public static void main(String[] args) {
        List<String> cars = new LinkedList<>();

        //add elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //print original list
        System.out.println("Original cars list: ");
        for (String car : cars){
            System.out.println(car);
        }
        System.out.println();

        //addFirst()
        cars.addFirst("Harrier");
        System.out.println("After addFirst(Harrier) ");
        for (String car : cars){
            System.out.println(car);
        }
        System.out.println();

        //addLast()
        cars.addLast("Toyota");
        System.out.println("After addLast(Toyota)");
        for (String car : cars){
            System.out.println(car);
        }
        System.out.println();

        //removeLast()
        System.out.println("After removeFist()" + cars.removeFirst());
        for (String car : cars){
            System.out.println(car);
        }
        System.out.println();

        System.out.println("Final car list: ");
        for ( String i : cars){
            System.out.println(i);
        }
        //getFirst()
        System.out.println("The first car is " + cars.getFirst());

        //get last()
        System.out.println("The Last Car is: " + cars.getLast());
    }
}
