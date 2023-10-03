package w5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Cat {
    int age;
    String name;

    public Cat(int age, String name) {
        super();
        this.age = age;
        this.name = name;
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
        Set<Cat> s= new HashSet<>();
        s.add(new Cat(1, "Cookie"));
        s.add(new Cat(2, "Milk"));
        s.add(new Cat(1, "Cookie"));
        System.out.println(s);
        s= new HashSet<>();
        s.add(new Cat(1, "Cookie"));
        s.add(new Cat(2, "Milk"));
        s.add(new Cat(1, "Cookie"));
        s.add(new Cat(5, "Cookie"));
        s.add(new Cat(4, "Butter"));
        s.add(new Cat(4, "Coffee"));
        System.out.println(s);
    }
}
