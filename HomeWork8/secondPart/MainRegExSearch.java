package HomeWork8.secondPart;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainRegExSearch {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\user\\IdeaProjects\\TMP\\src\\HomeWork8\\secondPart\\voinaimir.txt");
        String actual = Files.readString(path);

        RegExSearch regExSearch = new RegExSearch();
        System.out.println(regExSearch.search(actual, "война"));
        System.out.println(regExSearch.search(actual, " и "));
        System.out.println(regExSearch.search(actual, "мир"));


    }
}
//