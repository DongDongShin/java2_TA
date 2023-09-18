package w2;

public class NameCat2 {
    private String name;	// 필드
    private  int age;


    public NameCat2() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public NameCat2(String name) {
        this.name = name;
    }

    public NameCat2(String name, int age){
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println("Nom nom nom!");
    }
    public void yaong() {
        System.out.println("meow~");
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "NameCat2[name=" +name+ ", age=" + age + "]";
    }


    public static void main(String[] args) {

        NameCat2 c1, c2 ,c3;	// 지역변수

        c1 = new NameCat2();
        c2 = new NameCat2("Bella");
        c3 = new NameCat2("kitty",19);


        c1.setName("Cleo");
        c1.setAge(20);

        c2.setAge(21);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


    }
}