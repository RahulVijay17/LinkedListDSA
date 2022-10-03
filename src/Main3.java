public class Main3 {

    public static void main(String[] args) {
        LinkedList myLinkedList =new LinkedList(1);
        myLinkedList.append(4);

        //myLinkedList.printList();

        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());

    }
}
