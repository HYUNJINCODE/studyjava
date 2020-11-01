package myarraylist;

import java.util.Arrays;

public class MyArrayList<T> {
    private static final int INIT_CAPACITY=10;
    private T[] theData;
    private int size;
    private int capacity =INIT_CAPACITY;

    public MyArrayList() {
        theData =(T[]) new Object[INIT_CAPACITY];
        //객체 생성할때 실제로 존재하는 타입을 넣어야함.
        //타입파라미터를 넣을수없음 T[10] 이런거 x
        size=0;
    }
    public void add(int index, T anEntry){
        //error, exception.
        if(index<0||index>size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        if(size>=capacity)
            reallocate();
        for (int i = size-1; i>=index; i--) {
            theData[i+1] = theData[i];
        }
        theData[index] = anEntry;
        size++;
    }

    private void reallocate() {
        capacity*=2;
        theData = Arrays.copyOf(theData,capacity);
    }

    public void add(T enEntry) {
        add(size,enEntry);
    }

    public int size() {
        return size;
    }

    public int indexOf(T anEntry) {
        for (int i = 0; i <size; i++) {
            if(theData[i].equals(anEntry)) {
                return i;
            }

        }
        return -1;
    }
}
