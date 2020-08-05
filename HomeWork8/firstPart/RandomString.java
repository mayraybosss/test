package HomeWork8.firstPart;

import java.util.Random;

public class RandomString {

    public static String random(int stringLength) {
        String random = "ABCDEFGHIJKLMNOPQRSTUVWXYZ " + "abcdefghijklmnopqrstuvxyz"
                        + "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" + "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < stringLength; i++) {
            result.append(random.charAt(rnd.nextInt(117)));
        }
        return result.toString();
    }
}
