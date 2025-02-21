import java.util.*;

public class SumCalculator {
    
    // Method to parse string to integer
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str); // Convert string to integer
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null; // Return null if parsing fails
        }
    }
    
    // Method to calculate sum of list of integers
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num != null) { // Only add valid numbers
                sum += num; // Unboxing occurs here
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        
        // Test Case 1
        String[] inputs1 = {"10", "20", "30", "40", "50"};
        for (String input : inputs1) {
            Integer num = parseStringToInteger(input);
            if (num != null) {
                numbers.add(num); // Autoboxing occurs here
            }
        }
        System.out.println("The sum of the list is: " + calculateSum(numbers));
        
        // Test Case 2
        numbers.clear(); // Reset list
        String[] inputs2 = {"100", "200", "300"};
        for (String input : inputs2) {
            Integer num = parseStringToInteger(input);
            if (num != null) {
                numbers.add(num);
            }
        }
        System.out.println("The sum of the list is: " + calculateSum(numbers));
        
        // Test Case 3
        numbers.clear(); // Reset list
        String[] inputs3 = {"50", "invalid", "70"};
        for (String input : inputs3) {
            Integer num = parseStringToInteger(input);
            if (num != null) {
                numbers.add(num);
            }
        }
        System.out.println("The sum of the list is: " + calculateSum(numbers));
    }
}
//Madhavi Kumawat_22BCS12660
