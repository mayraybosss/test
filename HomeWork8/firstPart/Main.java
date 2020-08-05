package HomeWork8.firstPart;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        List<Person> persons = new LinkedList<>();
        List<Animal> animals = new ArrayList<>();

        long startLinked = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            persons.add(new Person(RandomString.random(rnd.nextInt(20)), RandomString.random(rnd.nextInt(20))));
        }

        long stopLinked = System.currentTimeMillis();

        System.out.println(stopLinked - startLinked);// 1562 - заполнение линкед листа

        long startArray = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            animals.add(new Animal(rnd.nextInt(15), RandomString.random(rnd.nextInt(20))));
        }

        long stopArray = System.currentTimeMillis();

        System.out.println(stopArray - startArray); // 688 заполнение ArrayList
/*      Это для сорта persons
        System.out.println(persons);
        persons.sort(new PersonPasswordComparator());
        System.out.println(persons);
        persons.sort(new PersonPasswordAndNickComparator());

 */
/*      Это для сорта animals
        System.out.println(animals);
        animals.sort(new AnimalAgeComparator());
        System.out.println(animals);
        animals.sort(new AnimalAgeAndNickComparator());
        System.out.println(animals);
*/
        long startDeleteLinked = System.currentTimeMillis();
        Iterator<Person> personIterator = persons.iterator();

        while(personIterator.hasNext()) {
            personIterator.next();
            personIterator.remove();
        }
        long stopDeleteLinked = System.currentTimeMillis();

        System.out.println(stopDeleteLinked - startDeleteLinked); // 61  delete time from linkedlist

        long startDeleteArray = System.currentTimeMillis();

        for (int i = 0; i < animals.size(); i++) {
            animals.remove(i); // я не понимаю почему оно не работает
        }

        long stopDeleteArray = System.currentTimeMillis();

        System.out.println(stopDeleteArray - startDeleteArray);
        System.out.println(persons + " " + animals);
    }
}
