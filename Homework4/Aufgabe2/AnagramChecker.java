package Homework4.Aufgabe2;
import java.util.Scanner;
public class AnagramChecker {

    /**
     * Returns true if the two strings are anagrams of each other.
     */
    public static boolean isAnagram (String a, String b) {
// TODO: implement using countLetters ()
        int[] counts_a = countLetters(a);
        int[] counts_b = countLetters(b);
        for (int i = 0; i < counts_a.length; i++) {
            if (counts_a[i] != counts_b[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Helper method to count how many times each letter (a-z) appears .
     */
    public static int [] countLetters (String s) {
        int [] counts = new int [26];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            counts[index]++;
        }
        return counts ;
    }

    /**
     * Print only letters that appear in the string with their counts.
     */
    public static void printLetterCounts (String s) {
        int[] counts = countLetters(s);
        char aktBuchstabe = 'a';
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] != 0){
                System.out.print(aktBuchstabe + ": " + counts[i] + "\n");
            }
            aktBuchstabe++;
        }
    }
    public static void main( String [] args) {
        Scanner scanner = new Scanner (System.in);
// Get two strings from the user
        System .out.print (" Enter the first string: ");
        String word1 = scanner . nextLine ();
        System .out.print (" Enter the second string: ");
        String word2 = scanner . nextLine ();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        word1 = word1.replaceAll(" ", "");
        word2 = word2.replaceAll(" ", "");
        System .out. println (" Are they anagrams ? " + isAnagram (word1 , word2 ));
        printLetterCounts (word1);
    }

}
