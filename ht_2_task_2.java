
// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class Main {
    public static void main(String[] args) {
        File myFile = new File("ht_2_task_2.txt");

        try (BufferedReader myBufferedFile = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = myBufferedFile.readLine()) != null) {

                String newLine[] = line.split("\"");
                StringBuilder result = new StringBuilder(
                        "Студент " + newLine[3] + " получил " + newLine[7] + " по предмету " + newLine[11]);
                System.out.println(result);
            }
        } catch (Exception e) {

            System.out.println("Что-то пошло не так");

        }
    }
}
