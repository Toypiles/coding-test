package javabasic.java_lecture.poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] arr={new Dog(), new Cat(), new Cow(), new Pig()};

        for (Animal animal : arr) {
            soundAnimal(animal);
        }

    }
    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
