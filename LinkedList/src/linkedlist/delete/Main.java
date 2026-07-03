// Deklarasi package
package linkedlist.delete;

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

	// Delete di awal
	void deleteAtBeginning() {
		if (head == null) {
			return;
		}
		head = head.next;
	}

	// Delete di akhir
	void deleteAtEnding() {
		if (head == null) {
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	// Delete di posisi tertentu
	void deleteAtPosition(int position) {
		if (head == null) {
			return;
		}
		if (position == 0) {
			head = head.next;
			return;
		}
		Node temp = head;
		for (int i = 0; i < position - 1 && temp != null; i++) {
			temp = temp.next;
		}
		if (temp == null || temp.next == null)
			return;
		temp.next = temp.next.next;
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
		// Membuat Linked List
		list.head = new Node(1);
		list.head.next = new Node(8);
		list.head.next.next = new Node(27);
		list.head.next.next.next = new Node(81);
		list.head.next.next.next.next = new Node(125);
		
		// Menampilkan hasil sebelum Deletion
		System.out.println("Before Deletion");
		list.display();
		System.out.println();

		// Menampilkan Deletion di awal
		list.deleteAtBeginning();
		System.out.println("After Deletion the First Node");
		list.display();
		System.out.println();

		// Menampilkan Deletion di akhir
		list.deleteAtEnding();
		System.out.println("After Deletion the Last Node");
		list.display();
		System.out.println();

		// Menampilkan Deletion di posisi tertentu
		list.deleteAtPosition(1);
		System.out.println("After Deletion the Certain Node");
		list.display();
		System.out.println();
	}
}