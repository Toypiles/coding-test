package javabasic.list;

public class MyDoubleLinkedList<T> implements IList<T> {
    //노드 클래스
    private class Node{
        T data;
        Node prev;
        Node next;

        Node(T data){this.data=data;}

        Node(T data, Node prev, Node next){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }
    //맴버 변수 선언
    private Node head;
    private Node tail;
    private int size;
    //생성자
    public MyDoubleLinkedList(){
        this.size=0;
        this.head= new Node(null);
        this.tail = new Node(null);

        this.head.next=this.tail;
        this.tail.prev=this.head;
    }
    //size
    @Override
    public int size(){
        return this.size;
    }
    //clear
    @Override
    public void clear(){
        this.size=0;
        this.head= new Node(null);
        this.tail = new Node(null);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    //add
    @Override
    public void add(T t){
        Node last = this.tail.prev;
        Node node = new Node(t, last, tail);
        last.next =node;
        this.tail.prev=node;
        this.size++;
    }
    //get
    @Override
    public T get(int index){
        if(index>=this.size || index<0){
            throw new IndexOutOfBoundsException();
        }
        int i=0;
        Node curr=null;
        if(index< this.size/2){ //index가 head 노드와 거 가까운 경우
            curr=this.head.next;
            while (i++<index) {
                curr=curr.next;
            }
        } else {//index가 tail 노드와 더 가까운 경우
            curr=this.tail.prev;
            while (i++<(this.size-index-1)) {
                curr=curr.prev;
            }
        }
        return curr.data;
    }
    //insert
    @Override
    public void insert(int index, T t){
        if(index>this.size || index<0){
            throw new IndexOutOfBoundsException();
        }
        Node prev;
        Node curr;
        int i=0;
        if(index<this.size/2){
            prev=this.head;
            curr=this.head.next;
            while (i++<index) {
                prev=prev.next;
                curr=curr.next;
            }
        } else{
            curr=this.tail;
            prev=this.tail.prev;

            while (i++<(this.size-index)) {
                curr=curr.prev;
                prev=prev.prev;
            }
        }
        Node node = new Node(t, prev, curr);
        prev.next=node;
        curr.prev=node;
        this.size++;
    }
    //deleteByindex
    @Override
    public boolean deleteByindex(int index){
        if(index>=this.size || index<0){
            throw new IndexOutOfBoundsException();
        }
        Node prev = null;
        Node curr = null;
        Node next = null;
        int i=0;
        if(index<this.size/2){
            prev=this.head;
            curr=this.head.next;
            while (i++<index) {
                prev=prev.next;
                curr=curr.next;
            }
            prev.next=curr.next;
            curr.next.prev=prev;
            curr.next=null;
            curr.prev=null;
        }else{
            curr=this.tail.prev;
            next=this.tail;
            while (i++<(this.size-index-1)) {
                curr=curr.prev;
                next=next.prev;
            }
            curr.prev.next=next;
            next.prev=curr.prev;
            curr.next=null;
            curr.prev=null;
        }
        this.size--;
        return true;
    }
    //contains
    @Override
    public boolean contains(T t){
        Node curr = this.head.next;
        while (curr!=null) {
            if(curr.data!=null && curr.data.equals(t)){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
    //indexOf (첫 번째 방법)
    @Override
    public int indexOf(T t){
        Node curr = this.head.next;
        int index=0;
        while (curr!=null) {
            if(curr.data!=null && t.equals(curr.data)){
                return index;
            }
            curr=curr.next;
            index++;
        }
        return -1;
    }
    //indexOf (두 번째 방법)
    /*
    Node curr=null;
    Node prev=null;
    Node next =null;
    if(index<this.size/2){
        curr=this.head.next;
        prev=this.head;
        int index=0;
        while (curr!=null) {
            if(curr.data!=null && curr.data.equals(t)){
                return index;
            }
            curr=curr.next;
            prev=prev.next;
            index++;
        }
    } else{
        curr=this.tail.prev;
        next=this.tail;
        int index=0;
        while (curr!=null) {
            if(curr.data!=null && curr.data.equals(t)){
                return index-this.size-1;
            }
            curr=curr.prev;
            next=next.prev;
            index++;
        }
    }
     */
    //isEmpty
    @Override
    public boolean isEmpty(){
        return this.head.next==this.tail;
    }
}
