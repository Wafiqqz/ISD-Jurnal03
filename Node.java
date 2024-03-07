package Jurnal03;

public class Node {
    Node next;
    Buku data;
    
    public Node(Buku data){
        this.next = null;
        this.data = data;
    }
}