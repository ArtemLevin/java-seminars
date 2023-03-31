import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;

public class iteratorEXP {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new  ArrayList<>(10);

        for (int i = 0; i <11; i++) {
            myList.add(i);
        }

        for (int number: myList){System.out.print(number + "\t|\t");}
        System.out.println();
        System.out.println(myList[2]);
        System.out.println(myList.indexOf(5));;

        // System.out.println();

        // ListIterator<Integer> col = myList.listIterator();

        // while(col.hasNext()){
        //     System.out.print(col.next() + "\t|\t");
        // }

        // myList.add(15);
        // for (int number: myList){System.out.print(number + "\t|\t");}
        
    }
    
}
