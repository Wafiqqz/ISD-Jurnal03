package Jurnal03;

public class SinglyLinkedList {
    Node head;
    Node tail;
    
    public void tambahDepan(Buku data) {
        Node newnode = new Node(data);
        if (head == null && tail == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        newnode.next = head;
        head = newnode;
    }
    public void print(){
        Node iterator = head;

        while (iterator != null) {
            System.out.println(iterator.data.judulBuku + ", " + iterator.data.penulis + ", " + iterator.data.tahunTerbit);
            iterator = iterator.next;
            
        }
    }
}