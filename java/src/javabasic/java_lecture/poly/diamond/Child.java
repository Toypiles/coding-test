package javabasic.java_lecture.poly.diamond;

public class Child implements InterFaceA, InterFaceB{
    @Override
    public void methodA(){
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB(){
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon(){
        System.out.println("Child.methodCommon");
    }
}
