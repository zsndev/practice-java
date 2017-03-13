package basic;

public class Queue {

    LinkedList linkedList = new LinkedList();

    public void enQueue(Object object) {
        linkedList.add(object);
    }

    public Object deQueue() {
        return linkedList.removeFirst();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return linkedList.size();
    }

}
