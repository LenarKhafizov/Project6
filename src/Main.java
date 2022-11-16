import java.util.HashMap;
import java.util.Map;
import static java.lang.Character.toLowerCase;

public class Main {
       public static void main(String[] args) {
        System.out.println("Домашнее задание. Коллекции HashSet и HashMap.");
        String text = Text.text();
        Map<Character, Integer> textMap = new HashMap<>();
        textMap.put(toLowerCase(text.charAt(0)), 1);
        for (int i = 1; i < text.length(); i++) {
            char s = toLowerCase(text.charAt(i));
            if (Character.isLetter(s)) {
                if (textMap.containsKey(s)) {
                    int sAmount = textMap.get(s);
                    sAmount++;
                    textMap.put(s, sAmount);
                } else {
                    textMap.put(s, 1);
                }
            }
        }
        int maxLetterAmount = -1;
        int minLetterAmount = Integer.MAX_VALUE;
        char maxLetter = 0;
        char minLetter = 0;
        for (Character key : textMap.keySet()) {
            int keyAmount = textMap.get(key);
            if (keyAmount > maxLetterAmount) {
                maxLetterAmount = keyAmount;
                maxLetter = key;
            }
            if (keyAmount < minLetterAmount) {
                minLetterAmount = keyAmount;
                minLetter = key;
            }
        }
        System.out.println("Буква '" + minLetter + "' встречается реже всего - " + minLetterAmount + " раз (-а).");
        System.out.println("Буква '" + maxLetter + "' встречается чаще всего - " + maxLetterAmount + " раз (-а).");
    }
}