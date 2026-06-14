import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Palindrome Checker Started ---");
        System.out.println("(Type 'exit' to stop the program)\n");
        
        while (true) {
            System.out.print("Enter a string: ");
            String original = scanner.nextLine();
            
            if (original.equalsIgnoreCase("exit")) {
                System.out.println("Program stopped. Bye!");
                break;
            }
            
            String cleaned = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String reversed = reverseString(cleaned);
            
            if (cleaned.equals(reversed) && !cleaned.isEmpty()) {
                System.out.println("\"" + original + "\" is a palindrome.\n");
            } else {
                System.out.println("\"" + original + "\" is not a palindrome.\n");
            }
        }
        
        scanner.close();
    }
    
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}