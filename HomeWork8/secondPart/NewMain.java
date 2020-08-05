package HomeWork8.secondPart;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewMain {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\user\\IdeaProjects\\TMP\\src\\HomeWork8\\secondPart\\voinaimir.txt");
        String actual = Files.readString(path);

        String regex = "(\\w+\\b)(?!.*\\1\\b)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(actual);

        Set<String> uniqueWords = new HashSet<>();

        while (matcher.find()) {
            uniqueWords.add(matcher.group());
        }
        System.out.println(uniqueWords);

        Map<Integer, String> map = new HashMap<>();
        String[] words = actual.split(" ");
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = 0; j < words.length; j++) {
                if(words[i].equals(words[j])){
                    count++;
                }
            }
            map.put(count, words[i]);
        }
        TreeMap<Integer, String> sorted = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        sorted.putAll(map);
        System.out.println(sorted);
    }
}
