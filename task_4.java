import java.util.Scanner;

// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// под знаками вопроса - одинаковые цифра
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69


//комментарии 
public class task_4 {
    public static void main(String[] args) {
        
        Scanner equation = new Scanner(System.in);
        System.out.println("Введите уравнение ");
        String my_equation = equation.nextLine();
        System.out.println("Вы ввели " + my_equation);

        int length = my_equation.length();
        int sum = 0;
        int[] arr = new int[] {0, 1, 5, 6, 10, 11};
        int[] numarr = new int[6];

        for (int i = 0; i < arr.length; i++) {

            if (Character.getNumericValue(my_equation.charAt(arr[i])) != -1){
                numarr[i] = Character.getNumericValue(my_equation.charAt(arr[i]));
            }
            if (Character.getNumericValue(my_equation.charAt(arr[i])) == -1){
                numarr[i] = -1;
            }
        
        }

        int result = 10*numarr[4] + numarr[5];

        for (int k = 0; k < 10; k++) {

            sum = 0;
            for (int j = 0; j < numarr.length - 2; j++) {

                if (j%2 == 0){

                    if (numarr[j] != -1)
                        sum = sum + 10*numarr[j];

                    if (numarr[j] == -1)
                        sum = sum + 10*k;
                }

                if (j%2 != 0){
                    
                    if (numarr[j] != -1)
                        sum = sum + numarr[j];

                    if (numarr[j] == -1)
                        sum = sum + k;
                }
            }

            if (sum == result)
                System.out.println("Искомая цифра " + k);
        }

    }

}

