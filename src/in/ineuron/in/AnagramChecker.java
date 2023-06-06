package in.ineuron.in;
public class AnagramChecker {
	  public static boolean areAnagrams(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        int[] count = new int[256]; // Assuming ASCII character set

	        for (int i = 0; i < str1.length(); i++) {
	            count[str1.charAt(i)]++;
	            count[str2.charAt(i)]--;
	        }

	        for (int i = 0; i < 256; i++) {
	            if (count[i] != 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";

	        if (areAnagrams(str1, str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	    }
	}


