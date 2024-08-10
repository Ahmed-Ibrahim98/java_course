package generics;

import java.util.ArrayList;

public class GenericMain {
    public static void main(String[] arg) {

        Printer<String> thing = new Printer<>("Ahmed");
        Printer<Integer> thing2 = new Printer<>(4);
        Printer<Double> thing3 = new Printer<>(4.5);
        thing.print();
        thing2.print();
        thing3.print();

        // to be discussed after collections
//        ArrayList <Object> animals = new ArrayList<>();
//        animals.add(new Cat());
////        animals.add(new Dog());
//        Cat mycat = (Cat) animals.get(0);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(100);
        objects.add("awad");
        objects.add("saleh");
        objects.addFirst("Ahmed");
//        int myInt = Integer.parseInt((String) objects.getFirst());
        System.out.println(objects);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        printList(objects);
        printList(numbers);

    }
//     public static void printList(ArrayList<?> arrayList){
//        System.out.println(arrayList);
//     }
     public static void printList (ArrayList<?> arrayList){
        System.out.println(arrayList);
     }
}
