package StringManipulation;

import java.util.Scanner;

public class SrtingReverseWordsButNotTest {
    static void reverse(char str[], int start, int end)
    {
        // Temporary variable
        // to store character
        char temp;

        while (start <= end) {
            // Swapping the first
            // and last character
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    // Function to reverse words
    static char[] reverseWords(char[] s)
    {
        // Reversing individual words as
        // explained in the first step

        int start = 0;
        for (int end = 0; end < s.length; end++) {
            // If we see a space, we
            // reverse the previous
            // word (word between
            // the indexes start and end-1
            // i.e., s[start..end-1]
            if (s[end] == ' ') {
                reverse(s, start, end);
                start = end + 1;
            }
        }

        // Reverse the last word
        reverse(s, start, s.length - 1);

        // Reverse the entire String
        reverse(s, 0, s.length - 1);
        return s;
    }
    public static void main(String[] args) {
        String s = "i like this program very much ";

        // Approach 1
        char[] p = reverseWords(s.toCharArray());
        System.out.print(p);

        // Approach2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original string : ");

        String originalStr = scanner.nextLine();
        scanner.close();

        String words[] = originalStr.split("\\s");
        String reversedString = "";

        //Reverse each word's position
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                reversedString = words[i] + reversedString;
            else
                reversedString = " " + words[i] + reversedString;
        }

        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    }
}


