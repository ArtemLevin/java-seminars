import java.util.Scanner;

public class sem_2_task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number ---> ");
        int n = input.nextInt();
        System.out.print("Enter the first symbol ---> ");
        String c1 = input.next();
        System.out.print("Enter the second symbol ---> ");
        String c2 = input.next();
        for (int i = 0; i < n/2; i++) {
            System.out.print(c1.concat(c2));   
        input.close();
        }

    }
}