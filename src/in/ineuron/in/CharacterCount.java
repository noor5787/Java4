package in.ineuron.in;
import java.util.Scanner; class CharacterCount {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        int vowelCount = 0;
	        int consonantCount = 0;
	        int specialCharCount = 0;

	        input = input.toLowerCase(); // Convert input to lowercase for easier comparison

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (Character.isLetter(ch)) {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowelCount++;
	                } else {
	                    consonantCount++;
	                }
	            } else if (!Character.isWhitespace(ch)) {
	                specialCharCount++;
	            }
	        }

	        System.out.println("Number of vowels: " + vowelCount);
	        System.out.println("Number of consonants: " + consonantCount);
	        System.out.println("Number of special characters: " + specialCharCount);
	    }
	}


