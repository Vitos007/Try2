package HomeworkLecture4.queue;

import java.util.HashMap;

public class NodeTest {
    public static void main(String[] args) {
        Node head = new Node(3);


        head.add(new Node(4));
        head.add(new Node(5));

        head.addNode(2, new Node(2));
        head.print(head);

        head.remove(2);
        head.print(head);
        head.print(head.getFromTail(1));

       /* head.print(head);
        head.removeLast();
        head.print(head);
        head.removeLast();
        head.print(head);
        head.removeLast();*/
    }

}
