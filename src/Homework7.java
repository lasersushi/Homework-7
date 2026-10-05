// Lucas Walker
// AT CS
// Homework #7

import java.util.Scanner;

public class Homework7 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        while (line.length() > 0) {
            checkPrintPal(oneWord(line));
            line = input.nextLine();
        }
    }
    public static String oneWord (String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char result = str.charAt(i);
            if ((result >= '0' && result <= '9') || ((result >= 'a'  && result >= 'z') || (result >= 'A' && result >= 'Z'))) {
                ans = ans + result;
            }
        }
        return ans;
    }
    
    public static void checkPrintPal (String str) {
        boolean ans = true;
        int len = str.length();
        for (int i = 0 ; i == (len - i); i++) {
            String resultFront = str.substring(i, i+1);
            String resultBack = str.substring(len - i, len - (i + 1));
            if (resultFront.equals(resultBack)) {
                ans = true;
            } else {
                ans = false;
            }
        }
        if (ans) {
            System.out.println("YES: " + str);
        } else {
            System.out.println("NO: " + str);
        }
    }
}
