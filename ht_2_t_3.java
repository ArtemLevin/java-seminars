import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;


// 3*дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7

public class ht_2_t_3 {
    public static void main(String[] args) {
        File calculus = new File("calculus.txt");
        Scanner symbol = new Scanner(System.in);
        System.out.print("Enter num1 --> ");
        double num1 = symbol.nextDouble();
        System.out.print("Enter action --> ");
        String action = symbol.next();
        System.out.print("Enter num2 -->  ");
        double num2 = symbol.nextDouble();
        double result = 0;

        String a = "+";
        String b = "-";
        String c = "*";
        String d = "/";

        try {

            FileWriter writer = new FileWriter(calculus, true);

            if (action.equals(a)) {
                result = num1 + num2;
                System.out.println(result);
            }

            if (action.equals(b)) {
                result = num1 - num2;
                System.out.print(result);
            }

            if (action.equals(c)) {
                result = num1 * num2;
                System.out.print(result);
            }

            if (action.equals(d)) {
                result = num1 / num2;
                System.out.print(result);
            }

            writer.write(num1 + action + num2 + "=" + result + "\n");
            writer.close();

        } catch (Exception e) {
            System.out.println("\n" + "Что-то не так");
        }

        symbol.close();
    }

}
