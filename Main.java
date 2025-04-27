import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = sc.nextInt();
        for(int i=2; i<=number; i+=2){
            System.out.println(i);
        }
    }
}