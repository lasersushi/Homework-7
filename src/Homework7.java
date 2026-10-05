// Lucas Walker
// AT CS
// Homework #7

import java.util.Scanner;

public class Homework7 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        while (line.length() > 0) {
            line = input.nextLine();
        }
    }
    public static String elimSpacePunc (String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char result = str.charAt(i);
            if ((result >= '0' && result <= '9') || ((result >= 'a'  && result >= 'z') || (result >= 'A' && result >= 'Z'))) {
                ans = ans + result;
            }
        }
        return ans;
    }
}
