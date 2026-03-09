public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        // Normalize string: remove spaces & special characters, convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        boolean result = isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}