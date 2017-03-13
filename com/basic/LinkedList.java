package basic;

public class LinkedList implements List, Iterator {

    private Node head;
    private Node tail;
    private Node listNext;
    private int listNextIndex;
    private int size;

    public void add(Object o) {
        Node node = new Node(o);
        if (size == 0) {
            head = node;
        } else {
            tail.next = node;
            node.pre = tail;
        }
        tail = node;
        size++;
    }

    public void add(int index, Object o) {
        Node node = new Node(o);
        if (index <= 0) {
            node.next = head;
            head = node;
        } else if (index >= size - 1) {
            tail.next = node;
            tail = node;
        } else {
            Iterator iterator = iterator();
            while (iterator.hasNext()) {
                iterator.next();
                if (index == listNextIndex) {
                    node.pre = listNext.pre;
                    node.next = listNext;
                    listNext.pre.next = node;
                    listNext.pre = node;
                }
            }
        }
    }

    public Object get(int index) {
        if (index < 0) {
            return null;
        } else if (index == 0) {
            return head.data;
        } else if (index == size - 1) {
            return tail.data;
        } else if (index > size - 1) {
            return null;
        } else {
            Iterator iterator = iterator();
            while (iterator.hasNext()) {
                iterator.next();
                if (index == listNextIndex) {
                    return listNext.data;
                }
            }
        }
        return null;
    }

    public Object remove(int index) {
        return null;
    }

    public int size() {
        return size;
    }

    public void addFirst(Object o) {

    }

    public void addLast(Object o) {

    }

    public Object removeFirst() {
        Node node = head;
        head = head.next;
        return node;
    }

    public Object removeLast() {
        return null;
    }

    public Iterator iterator() {
        listNextIndex = head == null ? -1 : 0;
        listNext = head;
        return this;
    }

    @Override
    public boolean hasNext() {
        return listNext != null;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Node node = listNext;
            listNext = listNext.next;
            listNextIndex++;
            return node.data;
        } else {
            return null;
        }
    }


    private static class Node {
        Object data;
        Node next;
        Node pre;

        public Node(Object data) {
            this.data = data;
        }
    }
}
