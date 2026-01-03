import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int side = scn.nextInt();

        int area = side * side;
        System.out.println("Area of Rectangle is " + area);
    }
}
