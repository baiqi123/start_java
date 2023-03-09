import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 10; i++)
        {
            int figure = input.nextInt();
            if(figure%2!=0){
                sum = sum + figure;
            }
        }
        System.out.println(sum);
    }
}