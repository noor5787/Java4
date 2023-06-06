package in.ineuron.in;
import java.util.Scanner;
public class PanagramChecker {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        if (isPangram(sentence)) {
	            System.out.println("The sentence is a pangram.");
	        } else {
	            System.out.println("The sentence is not a pangram.");
	        }
	    }

	    public static boolean isPangram(String sentence) {
	        sentence = sentence.toLowerCase();

	        // Create an array to track the occurrence of each alphabet
	        boolean[] alphabetOccurrence = new boolean[26];

	        // Iterate over the sentence characters
	        for (int i = 0; i < sentence.length(); i++) {
	            char c = sentence.charAt(i);
	            
	            // Check if the character is an English alphabet
	            if (c >= 'a' && c <= 'z') {
	                // Set the corresponding index to true
	                alphabetOccurrence[c - 'a'] = true;
	            }
	        }

	        // Check if any alphabet is missing
	        for (boolean occurred : alphabetOccurrence) {
	            if (!occurred) {
	                return false;
	            }
	        }

	        return true;
	    }
	}


