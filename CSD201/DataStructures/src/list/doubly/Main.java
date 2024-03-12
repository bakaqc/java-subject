package list.doubly;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(45);
        list.addLast(87);
        list.addLast(32);
        list.addLast(34);

        list.addFirst(34);
        list.addFirst(56);
        list.addFirst(89);
        list.addFirst(233);
        
        list.traversal();
        list.traversalReverse();
        
        list.delete(233);
        
        list.traversal();
        list.traversalReverse();
    }
}
