import java.util.Scanner;

public class sem_2_task_2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your line of symbols ---> ");
        String newLine = input.nextLine();
        String yourLine = newLine.concat(" ");
        char[] chArray = yourLine.toCharArray();
        int counter = 1;
        
        for (int i = 1; i < chArray.length; i++) {

            if (chArray[i] == chArray[i-1]){

                counter++;
            } 

            if (chArray[i] != chArray[i-1]){

                System.out.print(chArray[i-1]);
                System.out.print(counter);
                counter = 1;
            }

        }
        input.close();  
        }
    }
    

