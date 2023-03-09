import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float weight = input.nextFloat();
        float high = input.nextFloat();
        float BMI = weight / (high * high);
        if(weight>727||weight<0||high>2.72||high<0) {
            System.out.println("input out of range");
        } else if(BMI<18.5) {
            System.out.println("thin");
        }else if(BMI>=18.5&&BMI<24) {
            System.out.println("fit");
        }else if(BMI>=24&&BMI<28) {
            System.out.println("overweight");
        }else if(BMI>=28){
            System.out.println("fat");
        }
    }
}