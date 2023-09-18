package w2;

public class Human {

    private String name;
    private int age;

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
        Human human1 = new Human();
        Human human2 = new Human();

        human1.setName("Yuri");
        human1.setAge(19);

        human2.setName("Cheolmin");
        human2.setAge(20);

        System.out.println(human1);
        System.out.println(human2);
    }
}
