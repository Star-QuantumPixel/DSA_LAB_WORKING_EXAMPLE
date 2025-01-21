class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void printMiddle() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element: " + slow.data);
    }

    public SinglyLinkedList reverse() {
        SinglyLinkedList reversedList = new SinglyLinkedList();
        Node current = head;
        
        while (current != null) {
            Node newNode = new Node(current.data);
            newNode.next = reversedList.head;
            reversedList.head = newNode;
            current = current.next;
        }
        
        return reversedList;
    }

    public void removeDuplicates() {
        if (head == null) return;

        Node current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public static SinglyLinkedList merge(SinglyLinkedList list1, SinglyLinkedList list2) {
        SinglyLinkedList mergedList = new SinglyLinkedList();
        Node dummy = new Node(0);
        Node tail = dummy;

        Node ptr1 = list1.head;
        Node ptr2 = list2.head;

        while (ptr1 != null && ptr2 != null) {
            if (ptr1.data < ptr2.data) {
                tail.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                tail.next = ptr2;
                ptr2 = ptr2.next;
            }
            tail = tail.next;
        }

        if (ptr1 != null) tail.next = ptr1;
        if (ptr2 != null) tail.next = ptr2;

        mergedList.head = dummy.next;
        return mergedList;
    }

    public void deleteList() {
        head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Length of the list: " + list.length());

        list.printMiddle();

        SinglyLinkedList reversedList = list.reverse();
        System.out.print("Original List: ");
        list.printList();
        System.out.print("Reversed List: ");
        reversedList.printList();

        list.removeDuplicates();
        System.out.print("List after removing duplicates: ");
        list.printList();

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.append(2);
        list2.append(3);
        list2.append(6);
        SinglyLinkedList mergedList = SinglyLinkedList.merge(list, list2);
        System.out.print("Merged List: ");
        mergedList.printList();

        list.deleteList();
        System.out.print("List after deletion: ");
        list.printList();
    }
}
