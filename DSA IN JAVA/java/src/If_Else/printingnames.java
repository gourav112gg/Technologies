package If_Else;

import java.util.Scanner;

public class printingnames {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%5==0 && num%3==0) System.out.println("Divisible by 5 or 3");
        else if (num%5==0) {
            System.out.println("Divisible by 5");
        } else if (num%3==0) {
            System.out.println("Divisible by 3");
        }
        else System.out.println("Not even divisible by 5 or 3");
    }
}
