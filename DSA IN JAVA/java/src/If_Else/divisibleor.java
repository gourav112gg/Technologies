package If_Else;

import java.util.Scanner;

public class divisibleor {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num to check : ");
        int num = sc.nextInt();

        if (num%5==0 || num%3==0) System.out.println("divisible by 5 or 3");
        else System.out.println("not divisible by 5 or 3");
    }
}
