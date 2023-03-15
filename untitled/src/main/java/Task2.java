import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int value = rnd.nextInt(0, 10);
            arrlist.add(value);
        }
        System.out.printf("Изначальный список %s\n", arrlist);
        int maxValue = Collections.max(arrlist);
        int minValue = Collections.min(arrlist);
        int sum = 0;
        for (int i = 0; i < arrlist.size(); i++) {
            sum += arrlist.get(i);
        }
        float avarage = (float) sum / arrlist.size();

        System.out.printf("Максимальное значение %s\n", maxValue);
        System.out.printf("Минимальное значение %s\n", minValue);
        System.out.printf("Среднее арифметическое значение %s\n", avarage);
    }
}
