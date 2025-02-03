package javabasic.stack;

public class MyStack<T> implements IStack<T> {
    //노드 클래스
    private class Node{
        T data;
        Node next;
        Node(T data){this.data=data;}
        Node(T data, Node next){
            this.data=data;
            this.next=next;
        }
    }
    //멤버변수
    private int size;
    private Node head;
    //생성자
    public MyStack(){
        this.size=size();
        this.head=new Node(null);
        //this.head=null; 코드가 복잡해 질 수 있다.
    }
    //push
    @Override
    public void push(T data){
        Node node = new Node(data, this.head.next);
        this.head.next=node;
        this.size++;
    }
    //pop
    @Override public T pop(){
        if(this.isEmpty()){
            return null;
        }
        Node curr=this.head.next;
        this.head.next=curr.next;
        curr.next=null;
        this.size--;
        return curr.data;
    }
    //peak
    @Override
    public T peak(){
        if(this.isEmpty()){
            return null;
        }
        return this.head.next.data;
    }
    //size
    @Override
    public int size(){
        return this.size;
    }
}
