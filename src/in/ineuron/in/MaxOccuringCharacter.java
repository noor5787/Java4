package in.ineuron.in;
import java.util.HashMap;
import java.util.Map;

public class MaxOccuringCharacter {
	
	
	    public static char findMaxOccurringCharacter(String str) {
	        if (str == null || str.isEmpty()) {
	            throw new IllegalArgumentException("String cannot be null or empty");
	        }

	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count occurrences of each character in the string
	        for (char ch : str.toCharArray()) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }

	        char maxChar = ' ';
	        int maxCount = 0;

	        // Find the character with the maximum occurrence
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > maxCount) {
	                maxChar = entry.getKey();
	                maxCount = entry.getValue();
	            }
	        }

	        return maxChar;
	    }

	    public static void main(String[] args) {
	        String str = "Hello World";
	        char maxChar = findMaxOccurringCharacter(str);
	        System.out.println("Max occurring character: " + maxChar);
	    }
	}


