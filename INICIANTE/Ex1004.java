package INICIANTE;
import java.util.Scanner;

public class Ex1004 {
    public static void main(String[]args){
        int num1;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        int num2;
        num2 = scanner.nextInt();
        int produto = num1 * num2;
        System.out.printf("PROD = %d\n", produto);

    }
    
}
