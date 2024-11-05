
public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value =10;
        System.out.println("메서드 호출전: dataA.value = "+ dataA.value);
        chageReference(dataA);
        System.out.println("메서드 호출후: dataA.value = "+ dataA.value);
    }

    static void chageReference(Data dataX){
        dataX.value=20;
    }
}
