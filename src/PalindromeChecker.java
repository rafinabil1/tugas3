import java.util.Scanner;

/**
 * Kelas PalindromeChecker berisi metode untuk memeriksa apakah sebuah kata atau kalimat merupakan palindrome.
 */
public class PalindromeChecker {
    /**
     * Metode untuk memeriksa apakah sebuah kata atau kalimat merupakan palindrome.
     * @param str kata atau kalimat yang akan diperiksa
     * @return true jika kata atau kalimat merupakan palindrome, false jika tidak
     */
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metode utama untuk menjalankan program Palindrome Checker.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("## Program Java Palindrome Checker ##");
        System.out.println("======================================");
        System.out.println();
        System.out.print("Input kata atau kalimat: ");
        String str = input.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " adalah palindrome.");
        } else {
            System.out.println(str + " bukan palindrome.");
        }
    }
}