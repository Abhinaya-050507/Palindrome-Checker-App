class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        String normalized = input.toLowerCase();

        char[] chars = normalized.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input = " + input);
        System.out.println("Is Palindrome: " + (result ? "Yes" : "No"));
    }
}