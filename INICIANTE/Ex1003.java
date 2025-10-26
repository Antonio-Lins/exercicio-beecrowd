package INICIANTE;

import java.util.Scanner;


public class Ex1003 {
    public static void main(String[]args){
        int num1;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        int num2;
        num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.printf("SOMA = %d\n", soma);
    }
    
}
