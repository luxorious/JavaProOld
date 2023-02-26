package lessons.lesson7.src.stream;

public class MethodReferenceExample {
    public static void main(String[] args) {
        m1(MethodReferenceExample::mr);
    }

    public static void mr() {
            System.out.println("***");
            System.out.println("$$$");
            System.out.println("@@@");
    }


    public static void m1(I inter){
        System.out.println("!!!");
        inter.go();

    }
}

@FunctionalInterface
interface I{
    void go();
}

