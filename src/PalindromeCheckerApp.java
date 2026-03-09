public class PalindromeCheckerApp {

    // Recursive function
    static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // If characters mismatch
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result)
            System.out.println("Input = " + input + ", is Palindrome: Yes");
        else
            System.out.println("Input = " + input + ", is Palindrome: No");
    }
}