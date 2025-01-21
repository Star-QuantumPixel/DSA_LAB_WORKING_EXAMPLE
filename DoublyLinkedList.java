class DoublyLinkedList {
    Node head, tail;

    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void traverseBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.traverseBackward();
    }
}
