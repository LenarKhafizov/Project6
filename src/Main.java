import java.util.HashMap;
import java.util.Map;

public class Main {
        public static String textInp() {
        return "Доброй ночи!"; // Ввод исходного текста
        }

    public static void main(String[] args) {
        System.out.println("Домашнее задание. Коллекции HashSet и HashMap.");
        String text = textInp();
        Map<Character, Integer> textMap = new HashMap<>();
        textMap.put(text.charAt(0), 1);
        //for (int i = 1; i < text.length(); i++) {
        int i = 1;
        do {
            char s = text.charAt(i);
            for (Character key:textMap.keySet()) {
                if (s == key) {
                    int sAmount = textMap.get(s);
                    sAmount++;
                    textMap.put(s,sAmount);
                }
                else {
                    textMap.put(s, 1);
                    break;
                }
            }
            i++;
        } while (i < text.length());
        System.out.println(textMap);
    }
}