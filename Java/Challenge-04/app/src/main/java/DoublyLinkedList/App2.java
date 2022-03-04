package DoublyLinkedList;

public class App2 {
    public static void main(String[] args) {
        DoublLinkedList test = new DoublLinkedList();
        test.add(10);
        test.add(20);
        test.add(30);

        test.ToString();

        System.out.println(test.includes(0));
    }
}
