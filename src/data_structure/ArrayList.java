package data_structure;

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

    public Iterator iterator() {
        return null;
    }

    @Override
    public void add(Object o) {

    }

    @Override
    public void add(int index, Object o) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
