// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class sem_3_t_1 {
    public static void main(String[] args) {
        
        Random rndNum = new Random();
        
        ArrayList<Integer> myList = new ArrayList<>(50);
        for (int i = 0; i < 10; i++) {
            int num = rndNum.nextInt(10);
            myList.add(num);     
        }
        for(int p: myList){ System.out.print(p + " | ");}
        Collections.sort(myList);
        System.out.println();
        for(int p: myList){ System.out.print(p + " | ");}

    }
    
}
