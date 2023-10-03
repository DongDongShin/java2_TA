package w5.overriding;

import java.util.*;

public class Cat implements Comparable<Cat> {
    int age;
    String name;

    public Cat(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Cat o) {
        if (age < o.age) {
            return -1;
        }
        else if (age > o.age) {
            return 1;
        } else return name.compareTo(o.name);

    }

    @Override
    public String toString() {
        return "Cat [age=" + age + ", name= " + name + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age and name.");
        System.out.println("Enter negative age to end.");
        SortedSet<Cat> ageSet = new TreeSet<>();
        SortedSet<Cat> nameSet = new TreeSet<>(new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if (o1.name.compareTo(o2.name)==0) {
                    if(o1.age<o2.age)
                        return -1;
                    else if (o1.age > o2.age) {
                        return 1;
                    }
                    else return 0;
                } else return o1.name.compareTo(o2.name);
            }
        });

        boolean end = false;
        int age = 0;
        String name;
        Cat c;
        while (!end) {
            age = input.nextInt();
            if (age < 0) {
                end = true;
                break;
            }
            name = input.next();
            c = new Cat(age, name);
            ageSet.add(c);
            nameSet.add(c);
        }
        System.out.println(ageSet);
        System.out.println(nameSet);

    }


}
