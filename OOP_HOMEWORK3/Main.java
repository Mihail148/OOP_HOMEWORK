package OOP_HOMEWORK3;

import java.util.Iterator;

public class Main{
public static void main(String[] args) {
    DoubleLinkedList list = new DoubleLinkedList();
    list.add("task1");
    list.add("task2");

    list.add(1, "task2_1");

    Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()){
        String elem = iterator.next();
        System.out.println(elem);
    }
}
}