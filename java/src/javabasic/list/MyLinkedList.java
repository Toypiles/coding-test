package javabasic.list;
import java.util.Arrays;

public class MyLinkedList<T> implements IList<T> {
    private int size;
    private Node head;
    //생성자
    public MyLinkedList(){
        this.size=0;
        this.head=null; // dummy node
    }
    //노드 클래스
    private class  Node {
        T data;
        Node next;

        Node(T data){
            this.data =data;
        }

        Node(T data, Node next){
            this.data=data;
            this.next=next;
        }
    }
    //add
    @Override
    public void add(T t){
        Node curr = this.head;
        while (curr!=null) {
            curr=curr.next;
        }
        Node node = new Node(t);
        curr.next=node;
        this.size++;
    }
    //insert
    @Override
    public void insert(int index, T t){
        if(index>this.size || index<0){
            throw new IndexOutOfBoundsException();
        }
        Node prev = this.head;
        Node curr = prev.next;
        int i=0;
        while (i++<index) {
            prev=prev.next;
            curr=curr.next;
        }
        Node node = new Node(t, curr);
        prev.next= node;
        this.size++;
    }
    //clear
    @Override
    public void clear(){
        this.size=0;
        this.head.next=null;
    }
    //delete
    @Override
    public boolean delete(T t){
        Node prev=this.head;
        Node curr = prev.next;
        while (curr!=null) {
            if(curr.data.equals(t)){
                prev.next=curr.next;
                curr.next=null;
                this.size--;
                return true;
            }
            prev=prev.next;
            curr=curr.next;
        }
        return false;
    }
    //deleteByIndex
    @Override
    public boolean deleteByIndex(int index){
        if(index>= this.size || index<0){
            throw new IndexOutOfBoundsException();
        }
        Node prev = this.head;
        Node curr = prev.next;
        int i=0;
        while (i++<index) {
            prev=prev.next;
            curr = curr.next;
        }
        prev.next=curr.next;
        curr.next=null;
        this.size--;
        return true;
    }
    //get
    public T get(int index){
        if(index>=this.size || index<0){
            throw new IndexOutOfBoundsException();
        }
        Node curr = this.head.next;
        int i=0;
        while (i++<index) {
            curr=curr.next;
        }
        return curr.data;
    }
    //indexOf
    @Override
    public int indexOf(T t){
        Node curr = this.head.next;
        int index=0;
        while (curr!=null) {
            if(t.equals(curr.data)){
                return index;
            }
            curr= curr.next;
            index++;
        }
        return -1;
    }
    //isEmpty
    @Override
    public boolean isEmpty(){
        return this.head.next==null;
    }
    //contains
    @Override
    public boolean contains(T t){
        Node curr = this.head.next;
        while (curr!=null) {
            if(t.equals(curr.data)){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
    //size
    @Override
    public int size(){
        return this.size;
    }
}
