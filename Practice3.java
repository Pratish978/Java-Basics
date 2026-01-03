import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float pencilPrice = scn.nextFloat();
        float penPrice = scn.nextFloat();
        float eraserPrice = scn.nextFloat();

        float totalPrice = pencilPrice + penPrice + eraserPrice;
        System.out.println("Total Price of Pencil Pen and Eraser is" + totalPrice);

        float gst = totalPrice * 0.18f;
        System.out.println("GST on the total price is " + gst);

        float finalPrice = totalPrice + gst;
        System.out.println("Final Price after GST is " + finalPrice);
    }
}
