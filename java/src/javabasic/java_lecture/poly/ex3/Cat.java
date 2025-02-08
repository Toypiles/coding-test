package javabasic.java_lecture.poly.ex3;

public class Cat extends AbstracrAnimal{
    @Override
    public void sound(){
        System.out.println("냐옹");
    }

    @Override
    public void move(){
        System.out.println("고양이가 움직입니다.");
    }
}