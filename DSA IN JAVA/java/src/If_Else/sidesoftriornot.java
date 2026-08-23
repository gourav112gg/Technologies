package If_Else;

import java.util.Scanner;

public class sidesoftriornot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1 side: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2 side: ");
        int b = sc.nextInt();
        System.out.print("Enter the 3 side: ");
        int c = sc.nextInt();

        if (a+b>c && b+c>a && a+c>b) System.out.println("Sides of a triangle");
        else System.out.println("Invalid triangle");
    }
}
