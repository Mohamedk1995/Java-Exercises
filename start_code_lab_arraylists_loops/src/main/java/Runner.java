import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tiree");
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll");


//        1. Add "Coll" to the end of the list
//        2. Add "Tiree" to the start of the list
//        3. Add "Islay" after "Jura" and before "Mull"
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
            scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
            scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
            System.out.println("number of scottishIslands" + scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop
        for (int i = 0; i < scottishIslands.size(); i++) {
            System.out.println(scottishIslands.get(i));
        }

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

//        1. Print out a list of the even integers
        System.out.println("numbers: " + numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) ;

            System.out.println(numbers.get(i));


//        2. Print the difference between the largest and smallest value
            Collections.sort(numbers);
            System.out.println(Math.abs(numbers.get(10) - numbers.get(0)));

//        3. Print true if the list contains a 1 next to a 1 somewhere
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == 1 && numbers.get(i++) == 1) ;
            }
            System.out.println("True");


//        4. Print the sum of the numbers
            int total = 0;
            for (int number : numbers) {

                total += number;
            }
//
//        System.out.println(total);
        }
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.


        int total = 0;

        {
            for (int number : numbers) {
                if (number == 13) {
                    continue;
                    total += number;
                    System.out.println(total);
                }

            }
        }
    }
}

