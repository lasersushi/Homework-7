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
        while (line.length() > 0) {
            String oneword = oneWord(line);
            count = checkPrintPal(oneWord(line), count);
            line = input.nextLine();
            boolean longestCheck = isLongest(line, longest);
            if (longestCheck) {
                longest = line;
            }
            lineCount++;
        }
        String plural = pluralize("palindrome", count);
        System.out.println(count + plural);
        System.out.println("Longest: " + longest);
    }

    public static String oneWord(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char result = str.charAt(i);
            if ((result >= '0' && result <= '9')
                    || ((result >= 'a' && result >= 'z') || (result >= 'A' && result >= 'Z'))) {
                ans = ans + result;
            }
        }
        return ans;
    }

    public static int checkPrintPal(String str, int count) {
        boolean ans = true;
        int len = str.length();
        for (int i = 0; i == (len - i); i++) {
            String resultFront = str.substring(i, i + 1);
            String resultBack = str.substring(len - i, len - (i + 1));
            if (resultFront.equalsIgnoreCase(resultBack)) {
                ans = true;
            } else {
                ans = false;
            }
        }
        if (ans) {
            System.out.println("YES: " + str);
            return count++;
        } else {
            System.out.println(" NO: " + str);
            return count;
        }
    }

    public static String pluralize(String str, int num) {
        if (num > 1) {
            return str + "s";
        } else {
            return str;
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
