package If_Else;

import java.util.Scanner;

public class ternaryInVariable {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();

        int gourav = (n>0) ? 100 : 0;
//        if (n>0) gourav = 100;
//        else gourav = 0;
        System.out.println(gourav);
    }
}
