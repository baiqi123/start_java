import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        int wholecount =input.nextInt();
        int evaluation =input.nextInt();
        double area = input.nextDouble();
        double contact_tax = 0.0;
        if(times == 1){
            if(area <= 90){
                contact_tax = evaluation * 0.01 * 10000;
            }else if(area >90 && area <= 144){
                contact_tax = evaluation * 0.015 * 10000;
            }else if(area > 144){
                contact_tax = evaluation * 0.03 * 10000;
            }
        }else {
            contact_tax = evaluation * 0.03 * 10000;
        }
        double stamp_duty = (float)wholecount * 5.0;
        double jiaoyi = (float)area * 3.0;
        double cehui = (double)area * 1.36;
        System.out.printf((float)contact_tax+" "+(float)stamp_duty+" "+(float)jiaoyi+" "+(float)cehui);
    }
}