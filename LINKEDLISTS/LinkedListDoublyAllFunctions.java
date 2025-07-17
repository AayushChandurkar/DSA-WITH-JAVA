package JAVA;

public class LinkedListDoublyAllFunctions {
    Node head;
    Node tail;
    int size = 0;
    public LinkedListDoublyAllFunctions() {
        this.size = size;
    }

    
    public void InsertAtHead(int data){
        Node node = new Node(data);
        if(head != null){
            head.prev = node;
        }
        if (tail == null) {
            tail = node;
        }        
        node.next = head;
        node.prev = null;
        head = node;
        size++;
    }


    public void InsertAtTail(int data){
        Node node = new Node(data);
        if(tail == null){
            InsertAtHead(data);
            return;
        }
        tail.next = node;
        node.prev = tail;
        node.next=null;
        tail = node;
        size++;
    }


    public void InsertInBTW(int data, int index){
        Node node = new Node(data);
        Node temp = head;
        if(head == null){
            InsertAtHead(data);
            return;
        }
        for(int i = 0; i<index-1; i++){
             temp = temp.next;
        }
        node.next = temp.next;
        node.prev = temp;
        if(temp.next != null){
            temp.next.prev = node;
        }
        temp.next = node;
        size++;
    }


    public void DeleteHead() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        int val = head.data;
        if (head.next == null) {
            head = null;
            tail = null;
        } 
        else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Deleted Head Node with value " + val);
    }


    public void DeleteTail(){
        if(tail == null){
            System.out.println("List is Empty");;
        }
        Node temp = head;
        for(int i = 0; i<size-2; i++){
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        System.out.println("Deleted Tail Node with value " + val);
    }


public void DeleteInBTW(int index){
    if(index == 0){
        DeleteHead();
        return;
    }
    if(index == size - 1){
        DeleteTail();
        return;
    }
    Node temp = head;
    for(int i = 0; i < index - 1; i++){
        temp = temp.next;
    }
    int val = temp.next.data;
    temp.next = temp.next.next;
    if(temp.next != null){
        temp.next.prev = temp;
    }
    System.out.println("Deleted Node with value " + val);
    size--;
}

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    class Node {
        int data;
        public Node(int data) {
            this.data = data;
        }
        Node next;
        Node prev;
        public Node(int data,Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }


    public static void main(String[] args) {
        LinkedListDoublyAllFunctions list = new LinkedListDoublyAllFunctions();
        list.InsertAtHead(2);
        list.InsertAtHead(4);
        list.InsertAtHead(6);
        list.InsertAtHead(8);
        list.InsertAtHead(10);
        list.InsertAtTail(0);
        list.InsertInBTW(5, 3);
        list.DeleteHead();
        list.DeleteTail();
        list.DeleteInBTW(3);
        list.display();
    }
}
