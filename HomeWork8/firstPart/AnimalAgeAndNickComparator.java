package HomeWork8.firstPart;
//
import java.util.Comparator;

public class AnimalAgeAndNickComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if((o1.getAge() - o2.getAge()) != 0)
            return o1.getAge() - o2.getAge();

        return o1.getNick().compareToIgnoreCase(o2.getNick());
    }
}
