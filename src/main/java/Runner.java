import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Runner {

    public static void main(String[] args) {
//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        System.out.println("Scottish Islands:" + scottishIslands);


//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        int juraIndex = scottishIslands.indexOf("Jura");
        scottishIslands.add(juraIndex + 1, "Islay");

//        4. Print out the index position of "Skye"
        System.out.println("Index position of Skye: " + scottishIslands.indexOf(("Skye")));
        System.out.println("List before removing: " + scottishIslands);

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
        scottishIslands.remove("Arran");
        System.out.println("List after removing: " + scottishIslands);

//        7. Print the number of islands in your arraylist
        System.out.println("Number of islands: " + scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
        System.out.println("Alphabetically sorted list");

//        9. Print out all the islands using a for loop
        for (String island : scottishIslands) {
            System.out.println(island);
        }
        System.out.println(scottishIslands);


//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("\nnumbers: " + numbers);

//        1. Print out a list of the even integers
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

//        2. Print the difference between the largest and smallest value
        System.out.println(Collections.max(numbers) - Collections.min(numbers));

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (Objects.equals(numbers.get(i), numbers.get(i + 1))) {
                System.out.println("True");
                break;
            }
        }

//        4. Print the sum of the numbers,
        int sum = 0;
        for (Integer integer : numbers) {
            sum += integer;
        }
        System.out.println("Sum of all numbers: " + sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
        sum = 0;
        for (Integer number : numbers) {
            if (number < 13) {
                sum += number;
            }
        }
        System.out.println("Sum of < 13 numbers: " + sum);

    }

}
