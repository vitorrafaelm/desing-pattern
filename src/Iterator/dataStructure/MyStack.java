package Iterator.dataStructure;

import java.util.List;
import java.util.Stack;

public class MyStack {
    private Stack<String> _items = new Stack<>();
    public void addItems(List<String> items) {
        for (int i = 0; i < items.size(); i++) {
            _items.add(items.get(i));
        }
    }
    public void getItems() {
        String itemPopped = _items.pop();
        System.out.println("Item popped: " + itemPopped);
    }
    public int getSize() {
        System.out.println("Tamanho da lista: " + _items.size());
        return _items.size();
    }

    public boolean HasNext() {
        return !_items.isEmpty();
    }
}
