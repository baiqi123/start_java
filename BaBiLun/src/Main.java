import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n = input.nextFloat();
        float lastGuess = input.nextFloat();
        float nextGuess = (lastGuess+n/lastGuess)/2;
        if(n<0||lastGuess<=0){
            System.out.println("Wrong Format");
        }else {
            while(Math.abs(nextGuess-lastGuess)>=0.00001){
                lastGuess = nextGuess;
                nextGuess = (lastGuess+n/lastGuess)/2;
            }
            System.out.print(lastGuess);
        }
    }
}