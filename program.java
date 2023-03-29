// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = number.nextInt();
        int sum = 0;
        int fact = 1;
        for (int i = 0; i <num+1; i++) {
            sum = sum + i;
        }
        for (int i = 1; i < num + 1; i++) {
            fact = fact*i;
        }
        System.out.println(sum);
        System.out.println(fact);
        
    } 
}
    
