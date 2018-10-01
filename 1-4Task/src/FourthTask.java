import java.util.Scanner;

public class FourthTask {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string, modifiedString = new String();

        System.out.println("Enter any string: ");
        string = in.next();
        modifiedString = getPalindrome(string);
        System.out.printf("%s is palindrome of %s: %b", modifiedString, string, modifiedString.equals(string));

    }

    private static String getPalindrome(String string) {
        int length = string.length();
        char[] chars;
        chars = string.toCharArray();
        String modifiedString = "";

        for (int i = length - 1; i >= 0; i--) {
            modifiedString += chars[i];
        }
        return modifiedString;
    }
}
