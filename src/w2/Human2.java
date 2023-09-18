package w2;

public class Human2 {

    private String name;
    private int age;

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Human[name=" +name+ ", age=" + age + "]";
    }

    public static void main(String[] args) {
        Human2 human1 = new Human2("Yuri",19);
        Human2 human2 = new Human2("Cheolmin",20);

        System.out.println(human1);
        System.out.println(human2);
    }
}
