package javabasic.list;

import java.util.Arrays;

public class MyArrayList<T> implements IList<T>{
    private int size;
    private T[] elements;

    private static final int DEFAULT_SIZE=50;
    public MyArrayList(){
        this.size=0;
        this.elements=(T[]) new Object[DEFAULT_SIZE];
    }
    //add
    @Override
    public void add(T t){
        if(this.size == this.elements.length){
            this.elements = Arrays.copyOf(this.elements, this.size*2);
        }
        this.elements[this.size++]=t;
    }
    //insert
    @Override
    public void insert(int index, T t){
        for(int i=index; i<this.size; i++){
            this.elements[i+1]=this.elements[i];
        }
        this.elements[index]=t;
        this.size++;
    }
    //deleteByIndex
    @Override
    public boolean deleteByIndex(int index){
        if(index<0 || index>this.size-1){
            return false;
        }
        for(int i=index; i<this.size-1; i++){
            this.elements[i]=this.elements[i+1];
        }
        this.size--;
        return true;
    }
    //delete
    @Override
    public boolean delete(T t){
        for(int i=0; i<this.size; i++){
            if(this.elements[i].equals(t)){
                for(int j=i; j<this.size-1; j++){
                    this.elements[j]=this.elements[j+1];
                }
                this.size--;
                return true;
            }
        }
        return false;
    }
    //get == read
    @Override
    public T get(int index){
        if(index<0 || index>this.size-1){
            throw new IndexOutOfBoundsException();
        }
        return this.elements[index];
    }
    //contains
    @Override
    public boolean contains(T t){
        for(int i=0; i<this.size; i++){
            if(this.elements[i].equals(t)){
                return true;
            }
        }
        return false;
    }
    //indexOf
    @Override
    public int indexOf(T t){
        for(int i=0; i<this.size; i++){
            if(this.elements[i].equals(t)){
                return i;
            }
        }
        return -1;
    }
    //size
    @Override
    public int size(){
        return this.size;
    }
    //isEmpty
    @Override
    public boolean isEmpty(){
        return this.size==0;
    }
    //clear
    @Override
    public void clear(){
        this.size=0;
        this.elements=(T[]) new Object[DEFAULT_SIZE];
    }
}
