import java.util.Scanner;

class TextEditor {
    Node head, tail;

    class Node {
        char data;
        Node prev, next;

        Node(char data) {
            this.data = data;
            prev = next = null;
        }
    }

    public void insertAtEnd(char data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void deleteLastNode() {
        if (tail == null) return;
        if (tail.prev == null) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void modifyNode(int position, char newData) {
        Node temp = head;
        int count = 1;
        while (temp != null) {
            if (count == position) {
                temp.data = newData;
                return;
            }
            temp = temp.next;
            count++;
        }
    }

    public void displayText() {
        if (head == null) {
            System.out.println("Text is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add text");
            System.out.println("2. Delete last character");
            System.out.println("3. Modify text at position");
            System.out.println("4. Display text");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter character: ");
                    char data = scanner.nextLine().charAt(0);
                    editor.insertAtEnd(data);
                    break;
                case 2:
                    editor.deleteLastNode();
                    break;
                case 3:
                    System.out.print("Enter position: ");
                    int position = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new character: ");
                    char newData = scanner.nextLine().charAt(0);
                    editor.modifyNode(position, newData);
                    break;
                case 4:
                    editor.displayText();
                    break;
                case 5:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
            }
        }
    }
}
