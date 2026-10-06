// Lucas Walker
// AT CS
// Homework #7

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        int count = 0;
        int lineCount = 0;
        String longest = "";
        String ans = "";
        while (line.length() > 0) {
            String oneWord = oneWord(line);
            boolean isPal = checkPal(oneWord);
            if (isPal) {
                ans = ans + "YES: " + line + "\n";
                count++;
            } else {
                ans = ans + " NO: " + line + "\n";
            }
            boolean longestCheck = isLongest(line, longest);
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

    public static String oneWord(String str) {
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

    public static String pluralize(String str, int num) {
        if (num == 1) {
            return str;
        } else {
            return str + "s";
        }
    }

    public static boolean isLongest(String str, String longest) {
        // TODO: Fix method to deal with ties
        int longLen = longest.length();
        if (longLen < str.length()) {
            return true;
        } else {
            return false;
        }
    }
}
