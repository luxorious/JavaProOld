package lessons.lesson2.lesson2.src.pack2;

import pack1.Dog;

public class Cat extends Dog {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Cat voice");
    }
}
