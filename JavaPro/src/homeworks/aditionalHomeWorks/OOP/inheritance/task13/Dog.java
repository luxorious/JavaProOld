package homeworks.aditionalHomeWorks.OOP.inheritance.task13;

public abstract class Dog extends Eat{

    @Override
    void eating() {
        System.out.println("Cat eating");
    }

    @Override
    void sleep() {

    }

    public abstract void voice();
}
