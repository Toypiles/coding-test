package javabasic.java_lecture.poly.ex3;

public class Dog extends AbstracrAnimal{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }

    @Override
    public void move(){
        System.out.println("개가 움직입니다.");
    }
}
