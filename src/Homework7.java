// Lucas Walker
// AT CS
// Homework #7

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Uses standard input to take in the given input
        String line = input.nextLine();
        int count = 0;
        int lineCount = 0;
        String longest = "";
        String ans = "";
        while (line.length() > 0) {
            String oneWord = oneWord(line);
            boolean isPal = checkPal(oneWord);
            if (isPal) {
                ans = ans + "YES: " + line + "\n";  // This conditional block adds the given palindrome to the answer, which is printed at the end. It also adds a new line
                count++;
            } else {
                ans = ans + " NO: " + line + "\n";
            }
            boolean longestCheck = isLongest(line, longest, isPal);
            if (longestCheck) {
                longest = line;
            }
            line = input.nextLine();
            lineCount++;
        }
        System.out.println(ans);
        String plural = pluralize("palindrome", count);
        System.out.println(count + " " + plural);
        System.out.println("Longest: " + longest);
    }

    public static String oneWord(String str) { // This method reformats the given string so that it can be compared as a
                                               // palindrome, removing punctation and spaces
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char result = str.charAt(i);
            if ((result >= '0' && result <= '9')
                    || ((result >= 'a' && result <= 'z') || (result >= 'A' && result <= 'Z'))) {
                ans = ans + result;
            }
        }
        return ans;
    }

    public static boolean checkPal(String str) {
        boolean ans = true;
        int len = str.length();
        for (int i = 0; i <= (len - (i + 1)); i++) {
            String resultFront = str.substring(i, i + 1);
            String resultBack = str.substring(len - (i + 1), len - i);
            if (resultFront.equalsIgnoreCase(resultBack) && ans != false) {
                ans = true;
            } else {
                ans = false;
            }
        }
        return ans;
    }

    public static String pluralize(String str, int num) { // This method adds the s to the end of words if there is
                                                          // multiole of a quantity that word is describing
        if (num == 1) {
            return str;
        } else {
            return str + "s";
        }
    }

    public static boolean isLongest(String str, String longest, boolean isPal) { // This method checks for the longest
                                                                                 // word including spaces and
                                                                                 // explenation, not sure what I was
                                                                                 // supposed to to there
        int longLen = longest.length();
        if (longLen < str.length() && isPal) {
            return true;
        } else {
            return false; // I have this set so that it returns false even when there is a tie
        }
    }
}
