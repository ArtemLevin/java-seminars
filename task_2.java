// Вывести все простые числа от 1 до 1000

public class task_2 {
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++) {
            int counter = 0;
            for (int j = 1; j < i+1; j++) {
                if(i%j == 0){
                    counter++;
                }
            }
            if (counter==2){
                System.out.println(i);
            }
                
        }
    }
}
