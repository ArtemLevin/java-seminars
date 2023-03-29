import java.util.Scanner;

// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// под знаками вопроса - одинаковые цифра
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69



public class task_4_1 {
    public static void main(String[] args) {
        
        Scanner equation = new Scanner(System.in);
        System.out.println("Введите уравнение ");
        String my_equation = equation.nextLine();
        System.out.println("Вы ввели " + my_equation);

        int str_length = my_equation.length();

            if (str_length == 12){ // если результатом уравнения является двузначное число, то во всей строке при правильном вводе должно быть 12 символов, считая пробелы

            int sum = 0;
            int[] arr = new int[] {0, 1, 5, 6, 10, 11};// код написан для строгого формата ввода XX_+_YY_=_ZZ, нас интересуют цифры стоящие на позициях в массиве: 0, 1, 5, 6, 10, 11
            int[] numarr = new int[6]; // инициализируем массив, который будет хранить цифры уравнения

            for (int i = 0; i < arr.length; i++) { // цикл позволяет определить цифры, которые известны и которые неизвестны

                if (Character.getNumericValue(my_equation.charAt(arr[i])) != -1)
                    numarr[i] = Character.getNumericValue(my_equation.charAt(arr[i]));
                
                if (Character.getNumericValue(my_equation.charAt(arr[i])) == -1) // если символ не является цифрой, то вместо него в массив цифр уравнения будет помещена -1
                    numarr[i] = -1;
            
            }

            int result = 10*numarr[4] + numarr[5]; // число справа от знака равно

            for (int k = 0; k < 10; k++) { //перебираем все цифры от 0 до 9 для поиска совпадения левой и правой части уравнения 

                sum = 0;
                for (int j = 0; j < numarr.length - 2; j++) {

                    if (j%2 == 0){ // еслит индекс цифры в массиве четный, то она войдет в итоговую сумму с множителем 10, т.к. отвечает за количество десятков

                        if (numarr[j] != -1)//если цифра была дана в исходном уравнении
                            sum = sum + 10*numarr[j];

                        if (numarr[j] == -1)//если цифра была искомой
                            sum = sum + 10*k;
                    }

                    if (j%2 != 0){// если индекс цифры в массиве нечетный, то она войдет в итоговую сумму с множителем 1, т.к. отвечает за количество единиц
                        
                        if (numarr[j] != -1)//если цифра была дана в исходном уравнении
                            sum = sum + numarr[j];

                        if (numarr[j] == -1)//если цифра была искомой
                            sum = sum + k;
                    }
                }

                if (sum == result){// проверяем совпадает ли полученная сумма левой части уравнения для данного k с правой частью
                    System.out.println("Искомая цифра " + k);
                    k = 10;
                }
                
            }
        
        }

            if (str_length == 13){ // если результатом вычисления является трехзначное число, например, ?? + ?? = 110

                int sum = 0;
                int[] arr = new int[] {0, 1, 5, 6, 10, 11, 12};// код написан для строгого формата ввода XX_+_YY_=_ZZZ
                int[] numarr = new int[7]; // инициализируем массив, который будет хранить цифры уравнения

                for (int i = 0; i < arr.length; i++) {

                    if (Character.getNumericValue(my_equation.charAt(arr[i])) != -1)
                        numarr[i] = Character.getNumericValue(my_equation.charAt(arr[i]));
                    
                    if (Character.getNumericValue(my_equation.charAt(arr[i])) == -1)
                        numarr[i] = -1;
                    
                }

                int result = 100*numarr[4] + 10*numarr[5] + numarr[6];

                for (int k = 0; k < 10; k++) {

                    sum = 0;
                    for (int j = 0; j < numarr.length - 3; j++) {

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

                    if (sum == result){
                        System.out.println("Искомая цифра " + k);
                        k = 10;
                    }
                }

            
        

        }

    }
}

