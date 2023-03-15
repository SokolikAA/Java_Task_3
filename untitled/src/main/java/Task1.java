import java.util.ArrayList;
import java.util.Random;
// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int value = rnd.nextInt(0, 10);
            arrlist.add(value);
        }
        System.out.printf("Изначальный список %s\n", arrlist);
        int i = 0;
        while (i < arrlist.size()) {
            if (arrlist.get(i) % 2 == 0) {
                arrlist.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Финальный список %s\n", arrlist);
    }
}
