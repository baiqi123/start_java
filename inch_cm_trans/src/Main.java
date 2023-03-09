import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double meter = input.nextDouble();
        double bang = weight/0.45359237;
        double inch = meter/0.0254;
        System.out.printf((float)bang+" "+(float)inch);
    }
}