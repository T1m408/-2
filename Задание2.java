interface Documentable {
    void createDocument();
}
interface Learnable {
    void joinCourse();
}
class Director implements Documentable {
    private String fullName;

    Director(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void createDocument() {
        System.out.println(fullName + " готовит документы");
    }
}
class Coder implements Learnable {
    private String fullName;

    Coder(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void joinCourse() {
        System.out.println(fullName + " посещает курсы");
    }
}
public class TaskVariant2 {
    public static void main(String[] args) {
        Director boss = new Director("Тима");
        Coder dev = new Coder("Корган");

        boss.createDocument();
        dev.joinCourse();
    }
}
