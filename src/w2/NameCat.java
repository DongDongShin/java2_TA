package w2;

public class NameCat {
    private String name;	// 필드
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


    public static void main(String[] args) {

        NameCat c1, c2;	// 지역변수

        c1 = new NameCat();
        c2 = new NameCat();

        c1.setName("Bella");
        c2.setName("Kitty");

        System.out.println(c1.getName());
        System.out.println(c2.getName());

    }
}