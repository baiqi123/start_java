import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Sort = input.nextInt();
        int Chara = input.nextInt();
        if(Sort>=1&&Sort<=4&&Chara>=1&&Chara<=3){
            switch(Sort){
                case 1:
                    System.out.print("人类 ");
                    break;
                case 2:
                    System.out.print("精灵 ");
                    break;
                case 3:
                    System.out.print("兽人 ");
                    break;
                case 4:
                    System.out.print("暗精灵 ");
                    break;
                default:
                    System.out.print("Wrong Format");
                    break;
            }
            switch(Chara){
                case 1:
                    System.out.print("战士");
                    break;
                case 2:
                    System.out.print("法师");
                    break;
                case 3:
                    System.out.print("射手");
                    break;
                default:
                    System.out.print("Wrong Format");
                    break;
            }
        }else {
            System.out.print("Wrong Format");
        }
    }
}