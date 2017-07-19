package SimpleLinkedList;

/**
 * Created by thetear on 7/20/17.
 */
class Element {

    private int value;
    private Element nextElement;

    public Element(int d, Element n) {
        value = d;
        nextElement = n;
    }

    public void setNextElement(Element n) {
        nextElement = n;
    }

    public Element getNextElement() {
        return nextElement;
    }

    public int getValue() {
        return value;
    }
}