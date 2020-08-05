package HomeWork8.firstPart;

import java.util.Comparator;

public class PersonPasswordAndNickComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if ((o1.getPassword().length() - o2.getPassword().length()) != 0)
            return o1.getPassword().length() - o2.getPassword().length();

        return o1.getNick().compareToIgnoreCase(o2.getNick());
    }
}
