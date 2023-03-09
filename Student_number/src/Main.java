import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        long Student_Number = number % 100;
        long class_ = number / 100 % 100;
        long academy = number/10000%100;
        long year = number / 1000000 % 100;
        if(academy!=1&&academy!=2&&academy!=3&&academy!=20){
            System.out.print("Wrong Format");
        }
        else if(number>=100000000||number<10000000){
            System.out.print("Wrong Format");
        }else {
            System.out.println("入学年份：20"+year+"年");
            switch((int)academy){
                case 1:
                    System.out.println("学院：材料学院");
                    break;
                case 2:
                    System.out.println("学院：机械学院");
                    break;
                case 3:
                    System.out.println("学院：外语学院");
                    break;
                case 20:
                    System.out.println("学院：软件学院");
                    break;
                default:
                    System.out.print("Wrong Format");
                    break;
            }
            System.out.print("班级：");
            System.out.printf("%02d\n",class_);
            System.out.print("学号：");
            System.out.printf("%02d",Student_Number);
        }
    }
}