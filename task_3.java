import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class task_3 {
    public static void main(String[] args) {
        Scanner symbol = new Scanner(System.in);
        System.out.print("Enter num1 --> ");
        int num1 = symbol.nextInt();
        System.out.print("Enter action --> ");
        String action = symbol.next();
        System.out.print("Enter num2 -->  ");
        int num2 = symbol.nextInt();
        double resultDouble = 0;
        String a = "+";
        String b = "-";
        String c = "*";
        String d = "/";

        if (action.equals(a))
            System.out.println(num1 + num2);
        
        if (action.equals(b))
            System.out.print(num1 - num2);
        
        if (action.equals(c))
            System.out.print(num1*num2);
        
        if (action.equals(d)){
            resultDouble = num1/num2;
            System.out.print(resultDouble);
        }
        
        symbol.close();
        }
        
    
}
