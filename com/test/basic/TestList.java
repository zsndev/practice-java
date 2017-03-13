package test.basic;

import basic.Iterator;
import basic.LinkedList;
import basic.List;

public class TestList {

    public static void main(String[] args) {
        LinkedList linkedList = getCats();
        System.out.println(linkedList.get(3));
    }

    public static void printIterator(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static LinkedList getCats() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Cat("a", "1"));
        linkedList.add(new Cat("b", "2"));
        linkedList.add(new Cat("c", "3"));
        linkedList.add(new Cat("d", "4"));
        linkedList.add(new Cat("e", "5"));
        return linkedList;
    }

    public static class Cat {
        public String name;
        public String age;

        public Cat(String name, String age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" + name + age + '}';
        }
    }

}
