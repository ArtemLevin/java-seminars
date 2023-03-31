import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке. Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран и Нептун

public class sem_3_t_2 {
    public static void main(String[] args) {
        String[] planets = new String[] { "Меркурий", "Венера","Земля", "Марс","Юпитер", "Сатурн","Уран", "Нептун"};
        for(String p: planets){System.out.print(p + " \t|\t ");}
        Random rnd = new Random();
        ArrayList<String> varPlanets = new ArrayList<>(81);
        for (int i = 0; i < planets.length; i++) {
            int a = rnd.nextInt(10);
            for (int j = 0; j < a + 1; j++) {
                varPlanets.add(planets[i]);
                
            }
        }
        System.out.println();
        System.out.print(varPlanets);
        System.out.println();
        int counter = 1;
        for (int i = 1; i < varPlanets.size(); i++) {
            
            if(varPlanets.get(i).equals(varPlanets.get(i-1)))
                counter ++;
            
            else{
                System.out.println("\n" + varPlanets.get(i-1) + " " + counter);
                counter = 1;
            }
        }
            
        

        

    }
    
}

