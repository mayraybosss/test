package HomeWork8.secondPart;

public class EasySearch implements ISearchEngine {
    @Override
    public int search(String book, String wordToFind) {
        int count = 0;

        int index = 0;
        while(index != -1){
            index = book.indexOf(wordToFind, index);
            if(index != -1) {
                count++;
                index++;
            }
        }
        return count;
    }
}
