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

    public void insertBefore(Node next_node, int new_data) {
        if (next_node == null) {
            return;
        }
        Node newNode = new Node(new_data);
        newNode.next = next_node;
        newNode.prev = next_node.prev;

        if (next_node.prev != null) {
            next_node.prev.next = newNode;
        } else {
            head = newNode;
        }
        next_node.prev = newNode;
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.display();
        System.out.println();

        Node node = list.head.next.next;
        list.insertBefore(node, 25);
        list.display();
    }
}
