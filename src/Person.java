
public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " dvigaetsya");
    }

    public void talk() {
        System.out.println(fullName + " razgovarivaet");
    }
}