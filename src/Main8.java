public class Main8 {
    public static void main(String[] args) {
        LinkedList myLinkedList=new LinkedList(2);
        myLinkedList.append(3);

        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.removeFirst());
    }
}
