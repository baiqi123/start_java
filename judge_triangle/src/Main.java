import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        int judge1 = 0;
        int judge2 = 0;
        if(a<1||a>200||b<1||b>200||c<1||c>200){
            System.out.println("Wrong Format");
            return;
        }else if(a+b<=c||a+c<=b||b+c<=a){
            System.out.println("Not a triangle");
            return;
        }else {
            if(a==b &&b==c&&a==c){
                System.out.println("Equilateral triangle");
                return ;
            }if(a == b||b == c||a == c){
                judge1 = 1; //等腰三角形
            }if(a*a+b*b-c*c<0.00001||a*a+c*c-b*b<0.00001||b*b+c*c-a*a<0.00001){
                judge2 = 2; //直角三角形
            }if(judge1 == 1&&judge2 == 2){
                System.out.println("Isosceles right-angled triangle");
            }if(judge1 == 0&&judge2 == 0){
                System.out.println("General triangle");
            }if(judge1 == 1&&judge2 == 0){
                System.out.println("Isosceles triangle");
            }if(judge1 == 0&&judge2 == 2){
                System.out.println("Right-angled triangle");
            }
        }
    }
}
