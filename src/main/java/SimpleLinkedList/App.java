package SimpleLinkedList;

public class App {
    public static void main(String[] args) {

        SimpleLinkedList linkedList = new SimpleLinkedList();
//        linkedList.append(1);
        linkedList.append(3);
//        linkedList.append(2);
//        linkedList.append(2);
//        linkedList.append(3);
//        linkedList.append(4);
//        linkedList.append(5);
////        linkedList.append(1);

        System.out.println("----- List");
        linkedList.display();

        linkedList.removeGreaterElement(2);
        System.out.println("----- Formatted list size: " + linkedList.getSize());
        linkedList.display();
        System.out.println("----- Remove tail:");
        linkedList.removeTail();
        linkedList.display();

    }
}
