/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IIsubmission;

public class DoublyLinkedList {

    // 🔹 Node structure
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    // =====================================================
    // 1️⃣ Add at beginning
    // =====================================================
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }

        head = newNode;
    }

    // =====================================================
    // 2️⃣ Add at end
    // =====================================================
    public void addLast(int data) {
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
        newNode.prev = temp;
    }

    // =====================================================
    // 3️⃣ Insert AFTER a value
    // =====================================================
    public void insertAfter(int value, int newData) {
        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        Node newNode = new Node(newData);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
    }

    // =====================================================
    // 4️⃣ Insert BEFORE a value
    // =====================================================
    public void insertBefore(int value, int newData) {

        if (head == null) return;

        if (head.data == value) {
            addFirst(newData);
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        Node newNode = new Node(newData);

        newNode.prev = temp.prev;
        newNode.next = temp;

        temp.prev.next = newNode;
        temp.prev = newNode;
    }

    // =====================================================
    // 5️⃣ Delete first node
    // =====================================================
    public void deleteFirst() {
        if (head == null) return;

        head = head.next;

        if (head != null)
            head.prev = null;
    }

    // =====================================================
    // 6️⃣ Delete last node
    // =====================================================
    public void deleteLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    // =====================================================
    // 7️⃣ Delete specific node by value
    // =====================================================
    public void deleteByValue(int value) {

        if (head == null) return;

        // if deleting head
        if (head.data == value) {
            deleteFirst();
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        // if deleting last node
        if (temp.next == null) {
            temp.prev.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    // =====================================================
    // 8️⃣ Search element
    // =====================================================
    public boolean search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key)
                return true;

            temp = temp.next;
        }
        return false;
    }

    // =====================================================
    // 9️⃣ Size of list
    // =====================================================
    public int size() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // =====================================================
    // 🔟 Display forward
    // =====================================================
    public void displayForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // =====================================================
    // 1️⃣1️⃣ Display backward
    // =====================================================
    public void displayBackward() {
        if (head == null) return;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    // =====================================================
    // 🚀 Main method to test
    // =====================================================
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.insertAfter(20, 25);
        list.insertBefore(10, 5);

        System.out.print("Forward: ");
        list.displayForward();

        System.out.print("Backward: ");
        list.displayBackward();

        list.deleteFirst();
        list.deleteLast();
        list.deleteByValue(25);

        System.out.print("After deletions: ");
        list.displayForward();

        System.out.println("Search 20: " + list.search(20));
        System.out.println("Size: " + list.size());
    }
}
