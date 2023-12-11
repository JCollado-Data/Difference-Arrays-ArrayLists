import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // Declaration and Initialization
        ArrayList<Integer> arrayList = new ArrayList<>(); // Declaring an ArrayList of integers

        // Adding elements
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // Accessing elements
        System.out.println(arrayList.get(1)); // Accessing the second element (20)

        // Finding ArrayList size
        System.out.println("Size of ArrayList: " + arrayList.size()); // Outputs: 3

        // ArrayList of Strings
        ArrayList<String> namesList = new ArrayList<>(); // Initializing an ArrayList of strings
        namesList.add("Alice");
        namesList.add("Bob");
        System.out.println(namesList.get(0)); // Accessing the first element ("Alice")
    }
}