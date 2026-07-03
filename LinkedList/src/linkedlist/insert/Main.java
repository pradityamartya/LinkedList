// Deklarasi package
package linkedlist.insert;

//Deklarasi class Node
class Node {
	int data;
	Node next;

	// Constructor
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

//Deklarasi class LinkedListExample
class LinkedListExample {
    Node head;

    // Insert di awal
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    // Insert di akhir
    void insertAtEnding(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
 // Insert di posisi tertentu
    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position -1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    // Menampilkan hasil
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Deklarasi class utama Main
public class Main {
    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();
        System.out.print("Result from Insert : " );
        
        // Menampilkan Insertion di awal
        list.insertAtBeginning(1);
        
        // Menampilkan Insertion di akhir
        list.insertAtEnding(8);
        list.insertAtEnding(81);
        list.insertAtEnding(125);
        
        // Menampilkan Insertion di posisi tertentu
        list.insertAtPosition(27, 2);
      
        list.display();
    }
}