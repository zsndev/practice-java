package basic;

public class ArrayList implements List {

    private int size = 0;

    private Object[] elementData = new Object[100];

    private void expandCapacity() {
        Object[] newOne = new Object[elementData.length * 2];
        for (int i = 0; i < elementData.length; i++) {
            newOne[i] = elementData[i];
        }
        elementData = newOne;
    }

    private void moveForward(int index) {
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[size - 1] = elementData[size];
    }

    private void moveBackward(int index) {
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
    }

    public void add(Object o) {
        if (size > elementData.length / 5 * 4) {
            expandCapacity();
        }
        elementData[size] = o;
        size++;
    }

    public void add(int index, Object o) {
        if (size > elementData.length / 5 * 4) {
            expandCapacity();
        }
        moveBackward(index);
        elementData[index] = o;
        size++;
    }

    public Object get(int index) {
        if (index > -1 && index < size) {
            return elementData[index];
        }
        return null;
    }

    public Object remove(int index) {
        Object o = get(index);
        moveForward(index);
        return o;
    }

    public int size() {
        return size;
    }

    public Iterator iterator() {
        return null;
    }

}
