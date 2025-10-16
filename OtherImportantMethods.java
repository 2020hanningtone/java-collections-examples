package dataStructures;
import java.util.*;
public class OtherImportantMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(17); numbers.add(2); numbers.add(38);
        numbers.add(8); numbers.add(24);

        //lets loop using Iterator
        System.out.println("Original numbers:");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        // let's use other methods
        System.out.println("After reverseOder() method:");
        Collections.sort(numbers, Collections.reverseOrder());
        for (int i : numbers){
            System.out.println(i);
        }
        System.out.println("The maximum number is: "
                + Collections.max(numbers));
        System.out.println("The minimum number is: "
                + Collections.min(numbers));

       
    }

}
