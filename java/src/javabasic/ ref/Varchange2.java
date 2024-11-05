public class Varchange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value =10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 = "+dataA);
        System.out.println("dataA 참조값 = "+dataB);
        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataA.value = "+dataB.value);

        dataA.value =20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataA.value = "+dataB.value);

        dataB.value =30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = "+dataA.value);
        System.out.println("dataA.value = "+dataB.value);
    }
}
