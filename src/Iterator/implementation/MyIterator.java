package Iterator.implementation;

import Iterator.dataStructure.MyStack;
import Iterator.interfaces.Iterator;

public class MyIterator implements Iterator {
    private int index = 0;
    MyStack myList;

    public MyIterator(MyStack myList) {
        this.myList = myList;
    }

    @Override
    public boolean hasNext() {
        return myList.HasNext();
    }

    @Override
    public void getNext() {
        if(!hasNext()) {
            return;
        }
        myList.getItems();
        this.index++;
        getNext();
    }

    @Override
    public void reset() {
        this.index = 0;
    }
}
