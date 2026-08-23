package If_Else;

import java.util.Scanner;

public class ternarybasic {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

//        if (a%2==0) System.out.println("even");
//        else System.out.println("odd");

        // condition ? sach : juuth
        System.out.println((a%2==0)? "Even":"odd");

    }
}
