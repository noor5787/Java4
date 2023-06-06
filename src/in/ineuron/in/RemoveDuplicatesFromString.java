package in.ineuron.in;
import java.util.LinkedHashSet;
public class RemoveDuplicatesFromString {


	
	    public static void main(String[] args) {
	        String input = "INEURONPWSKILLS";
	        String result = removeDuplicates(input);
	        System.out.println("Original string: " + input);
	        System.out.println("String after removing duplicates: " + result);
	    }

	    public static String removeDuplicates(String str) {
	        LinkedHashSet<Character> set = new LinkedHashSet<>();
	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (set.add(ch)) {
	                sb.append(ch);
	            }
	        }

	        return sb.toString();
	    }
	}


