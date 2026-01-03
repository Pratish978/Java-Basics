import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();

        int AVG = (A + B + C) / 3;
        System.out.println("Average of  3 Numbers is " + AVG);
    }
}
