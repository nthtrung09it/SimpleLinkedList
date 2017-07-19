package SimpleLinkedList;

/**
 * Created by thetear on 7/20/17.
 */
class SimpleLinkedList {
    protected Element start;
    protected Element end;
    public int size;

    public SimpleLinkedList() {
        start = null;
        end = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void append(int val) {
        Element nptr = new Element(val, null);
        size++;
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            end.setNextElement(nptr);
            end = nptr;
        }
    }

    public void removeTail() {
        if (size == 0) {
            return;
        }
        Element s = start;
        Element t = start;
        while (s != end) {
            t = s;
            s = s.getNextElement();
        }
        end = t;
        end.setNextElement(null);
        size--;
    }

    public void removeGreaterElement(int value) {
        if (size == 0) {
            return;
        }
        Element s = start;
        Element t = start;
        while (s != end) {
            if (s.getValue() > value) {
                if (s == start) {
                    start = start.getNextElement();
                    s = start;
                    t = s;
                } else {
                    t.setNextElement(s.getNextElement());
                    s = s.getNextElement();
                }
                size--;
            } else {
                t = s;
                s = s.getNextElement();
            }
        }
        if (s.getValue() > value) {
            end = t;
            end.setNextElement(null);
            size--;
        } else {
            end = s;
        }
    }

    public void display() {

        if (size == 0) {
            System.out.println("Empty LinkedList");
            return;
        }
        if (start.getNextElement() == null) {
            System.out.println(start.getValue());
            return;
        }

        System.out.print(start.getValue() + "->");
        Element ptr = start.getNextElement();
        while (ptr.getNextElement() != null) {
            System.out.print(ptr.getValue() + "->");
            ptr = ptr.getNextElement();
        }
        System.out.print(ptr.getValue() + "\n");
    }
}