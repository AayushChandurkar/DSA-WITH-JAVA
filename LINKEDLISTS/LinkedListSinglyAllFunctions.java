package JAVA;
import java.util.*;


public class LinkedListSinglyAllFunctions{
    Node head;
    Node tail;
    int size = 0;
    public LinkedListSinglyAllFunctions() {
        this.size = size;
    }


    public void InsertAtHead(int data){
        Node firstNode = new Node(data);
        firstNode.next = head;
        head = firstNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }


    public void InsertAtTail(int data){
        Node last = new Node(data);
        if(tail == null){
            InsertAtHead(data);
            return;
        }
        tail.next = last;
        last.next = null;
        tail = last;
        size++;
    }

    public void InsertInBTW(int data, int index){
        if(index == 0){
            InsertAtHead(data);
            return;
        }
        if(index == size){
            InsertAtTail(data);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }


    public void DeleteHead(){
        int val = head.data;
        if(head == null){
            tail = null;
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        if (head == null) {
        tail = null;
        }
        size--;
        System.out.println("Deleted Head value : "+val);
    }


    public void DeleteTail(){
        int val = tail.data;
        Node temp = head;
        if(size<=1){
            DeleteHead();
            return;
        }
        for(int i=0; i<size-2;i++){
            temp = temp.next;
        }
        temp.next = null;
        size--;
        System.out.println("Deleted Tail value : "+val);
    }


    public void DeleteInBTW(int index){
        if(index == 0){
            DeleteHead();
        }
        if(index == size-1){
            DeleteTail();
        }
        Node prev = head;
        for(int i = 0; i<index-1; i++){
            prev = prev.next;
        }
        System.out.println("Delete value : "+prev.next.data);
        prev.next = prev.next.next;
    }


    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }


    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        LinkedListSinglyAllFunctions list = new LinkedListSinglyAllFunctions();
        System.out.println("Empty linked list created");
        list.InsertAtHead(10);
        list.InsertAtHead(6);
        list.InsertAtHead(8);
        list.InsertAtHead(5);
        list.InsertAtHead(3);
        list.InsertAtTail(15);
        list.InsertInBTW(7, 2);
        list.DeleteHead();
        list.DeleteTail();
        list.DeleteInBTW(1);
        list.InsertInBTW(4, 3);
        list.Display();
    }
}