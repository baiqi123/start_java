import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String num = "";
        for(int i=0,len=str.length();i<len;i++){
            if(str.charAt(i)=='-'&&str.charAt(i+1)=='1'){
                System.out.println(num);
                return;
            }else if(str.charAt(i)=='0'||str.charAt(i)=='1'){
                num+=str.charAt(i);
            }
        }System.out.println("Wrong Format");
    }
}