package lessons.lesson7.src.stream;

public class Example2 {
    public static void main(String[] args) {
        m1(() -> {
            System.out.println("***");
            System.out.println("$$$");
            System.out.println("@@@");
        });
    }

    public static void m1(Inter inter){
        System.out.println("!!!");
        inter.go();

    }
}

@FunctionalInterface
interface Inter{
    void go();
}