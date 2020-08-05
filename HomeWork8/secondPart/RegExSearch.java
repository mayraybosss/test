package HomeWork8.secondPart;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public int search(String book, String wordToFind) {
        int count = 0;
        String regex = "\\b" + wordToFind + "\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(book);
        while(matcher.find())
            count++;
        return count;
    }
}
//