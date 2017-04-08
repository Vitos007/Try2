package HomeworkLecture4.queue;

public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void add(Node node) {
        Node last = this;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(node);
    }

    public void removeLast() {
        Node last = this;
        while (last.getNext().getNext() != null) {
            last = last.getNext();
        }
        last.setNext(null);
    }

    public void print(Node head) {
        System.out.print(head.getValue() + " --> ");
        if (head.getNext() != null) {
            print(head.getNext());
        }
        System.out.println();
    }

    /**
     * Removes Node from list that is located on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     **/
    public void remove (int position) {
        Node last = this;
        for (int i = 1; i < position - 1; i++) {
          last = last.getNext();
        }
        last.setNext(last.getNext().getNext());

        /*Your code here*/
    }

    /**
     * Adds Node to list on position from head(start of the list).
     * If position is more than list size prints error message
     * @param position number of the Node starting from the head
     * @param node node should be inserted at position
     */
    public void addNode(int position, Node node) {
        Node last = this;
        for (int i = 1; i < position - 1; i++) {
            last = last.getNext();
        }
        Node lastTemp = last.getNext();
        last.setNext(node);
        last.getNext().setNext(lastTemp);
    }

    /**
     * Gets then Node that located on the position starting from the tail (end of the list)
     * if position is more than list size - prints error message
     * @param position number of the Node starting from the tail
     * @return Node that located on the position from the tail (end of list) if position exists in list
     */
    public Node getFromTail(int position) {
        Node last = this;
        int index = 0;
        while (last.getNext() != null) {
            last = last.getNext();
            index = index + 1;
        }
        index = index - position;
        Node back = new Node(index);
        return back;
    }
}
