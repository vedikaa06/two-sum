public class Solution {
    public static boolean isPalindrome(int n) {
        int original_n = n;  // Store original value
        int reversed_n = 0;
        
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }

        return original_n == reversed_n; // Return boolean
    }
 
    // Main function
    public static void main(String[] args) {
        int n = 123464321;
        
        if (isPalindrome(n))
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }
}
