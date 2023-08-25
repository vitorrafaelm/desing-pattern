package Iterator;

import Iterator.dataStructure.MyStack;
import Iterator.implementation.MyIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyStack myList = new MyStack();
        List<String> listToInsert = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listToInsert.add("Item number " + i);
        }

        myList.addItems(listToInsert);
        MyIterator myIterator = new MyIterator(myList);

        myIterator.getNext();

    }
}
