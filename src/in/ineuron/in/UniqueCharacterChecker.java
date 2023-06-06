package in.ineuron.in;

public class UniqueCharacterChecker {
	
	    public static boolean hasUniqueCharacters(String str) {
	        if (str.length() > 128) {  // Assuming ASCII character set (128 characters)
	            return false;
	        }

	        boolean[] charSet = new boolean[128];
	        for (int i = 0; i < str.length(); i++) {
	            int val = str.charAt(i);
	            if (charSet[val]) {
	                return false;
	            }
	            charSet[val] = true;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String str = "abcdefg";
	        boolean result = hasUniqueCharacters(str);
	        if (result) {
	            System.out.println("String contains all unique characters.");
	        } else {
	            System.out.println("String does not contain all unique characters.");
	        }
	    }
	}


