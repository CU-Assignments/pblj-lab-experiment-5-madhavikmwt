import java.util.*;

public class IntegerSumCalculator {
    
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null;
        }
    }
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num != null) {
                sum += num;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<String> inputValues = Arrays.asList("10", "20", "30", "40", "50");
        List<Integer> integerList = new ArrayList<>();
        
        for (String value : inputValues) {
            Integer parsedValue = parseStringToInteger(value);
            if (parsedValue != null) {
                integerList.add(parsedValue);
            }
        }
        
        int sum = calculateSum(integerList);
        System.out.println("The sum of the list is: " + sum);
    }
}
//Madhavi kumawat_22BCS12660
