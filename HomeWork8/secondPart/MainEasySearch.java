package HomeWork8.secondPart;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainEasySearch {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\user\\IdeaProjects\\TMP\\src\\HomeWork8\\secondPart\\voinaimir.txt");
        String actual = Files.readString(path);

        EasySearch easySearch = new EasySearch();
        System.out.println(easySearch.search(actual, "война"));
        System.out.println(easySearch.search(actual, " и "));
        System.out.println(easySearch.search(actual, "мир"));


    }
}
//