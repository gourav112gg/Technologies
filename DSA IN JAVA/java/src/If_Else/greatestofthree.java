package If_Else;

import java.util.Scanner;

public class greatestofthree {
    public static void main(String[] args) { // Fixed: Added public and String[] args
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st num: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd num: ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd num: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else { // Fixed: Removed the extra closing brace that was originally above this line
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
