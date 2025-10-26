package INICIANTE;

import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {
    double raio;
    Scanner scanner = new Scanner(System.in);
    raio = scanner.nextDouble();
    double area = 3.14159 * Math.pow(raio, 2);
    System.out.printf("A=%.4f\n", area);
    scanner.close();
    }
    
}
