package INICIANTE;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[]args){
        double num1;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextDouble();
        double num2;
        num2 = scanner.nextDouble();
        double num3;
        num3 = scanner.nextDouble();
        double media = (num1 * 2 + num2 * 3 + num3 * 5) / 10;
        System.out.printf("MEDIA = %.1f\n", media);
    }
    
}
