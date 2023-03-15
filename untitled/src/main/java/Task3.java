// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("36,6");
        arrayList.add("win");
        arrayList.add("2");
        arrayList.add("18");
        arrayList.add("mustdie");
        arrayList.add("82");
        arrayList.add("linux");
        arrayList.add("forever");
        arrayList.add(";)");

        System.out.printf("Изначальный список %s\n", arrayList);


        for (int i = 0; i < arrayList.size(); i++) {
            if (isNumeric(arrayList.get(i))) {
                arrayList.remove(i);
                i--;
            }
        }
        System.out.printf("Финальный список %s\n", arrayList);
    }

    private static boolean isNumeric(String s) {
        return s.chars().allMatch(Character::isDigit);
    }
}