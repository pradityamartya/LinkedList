// Deklarasi package
package linkedlist.circular;

// Deklarasi class Node
class Node {
	int data;
	Node next;

	// Constructor
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

// Deklarasi class CircularLinkedList
class CircularLinkedList {
	Node head;

	// Insert di awal
	void insertAtBeginning(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			head.next = head;
			return;
		}
		Node temp = head;

		while (temp.next != head) {
			temp = temp.next;
		}
		newNode.next = head;
		temp.next = newNode;
		head = newNode;
	}

	// Insert di akhir
	void insertAtEnding(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			head.next = head;
			return;
		}
		Node temp = head;

		while (temp.next != head) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.next = head;
	}

	// Insert di posisi tertentu
	void insertAtPosition(int data, int position) {
		Node newNode = new Node(data);

		// Insert at first position
		if (position == 0) {
			insertAtBeginning(data);
			return;
		}
		Node temp = head;

		for (int i = 0; i < position - 1 && temp.next != head; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	// Menampilkan hasil
	void display() {

		if (head == null) {
			System.out.println("Circular Linked List is empty!");
			return;
		}
		Node temp = head;

		do {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		} while (temp != head);

		System.out.println("(back to head)");
	}
}

// Deklarasi class Main
public class Main {
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		System.out.print("Result from Insert : ");

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