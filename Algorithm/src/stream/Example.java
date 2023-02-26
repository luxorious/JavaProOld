package lessons.lesson7.src.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 15; i++) {
            list.add(new Random().nextInt(22));
        }

//        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) %2 == 0){
//                System.out.println(list.get(i));
//            }
//        }
//
//        for (int a : list){
//            System.out.println(a);
//        }

//        list.stream().filter(el -> el %2 == 0).forEach(System.out::println);


//        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);

//        System.out.println("--------------------------------");
//        list.stream()
//                .filter(el -> el % 2 == 0)
//                .map(el -> {
//                    if (el % 6 == 0);
//                    return el;
//                })
//                .forEach(System.out::println);

        System.out.println("--------------------------------");
        list.stream()
                .map(el -> {
                    if (el % 6 == 0);
                    return el;
                })
                .forEach(System.out::println);


    }
}
