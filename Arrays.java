public class Arrays {
    public static void main(String[] args) {
        // Declaration and Initialization
        int[] numbers = new int[5]; // Declaring an array of integers with size 5

        // Initializing values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing elements
        System.out.println(numbers[2]); // Accessing the third element (30)

        // Finding array length
        System.out.println("Length of array: " + numbers.length); // Outputs: 5

        // Array of Strings
        String[] names = {"Alice", "Bob", "Charlie"}; // Initializing an array of strings
        System.out.println(names[1]); // Accessing the second element ("Bob")
    }
}