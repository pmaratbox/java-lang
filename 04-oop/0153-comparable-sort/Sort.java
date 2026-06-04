import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    static class Person implements Comparable<Person> {
        final String name;
        final int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person other) {
            return Integer.compare(this.age, other.age);
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("alice", 30));
        people.add(new Person("bob", 25));
        Collections.sort(people);

        List<String> names = new ArrayList<>();
        for (Person p : people) {
            names.add(p.name);
        }
        System.out.println(String.join(" ", names));
    }
}
