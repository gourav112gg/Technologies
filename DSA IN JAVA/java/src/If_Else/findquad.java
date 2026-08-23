package If_Else;

import java.util.Scanner;

public class findquad {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point on x-axis : ");
        int x = sc.nextInt();
        System.out.print("Enter point on y-axis : ");
        int y = sc.nextInt();

        if ((y = 0) == x) {
            System.out.println("lies on origin");
        }
        else if (x>0 && y>0) System.out.println("1st quad");
        else if (x<0 && y>0) {
            System.out.println("2nd quad");
        } else if (x<0 && y<0) {
            System.out.println("3rd qud");
        }
        else if (x>0 && y<0){
            System.out.println("4th quad");
        }
        else System.out.println("given points are not in any quad");
    }
}
