package javabasic.class1;
public class classStart2 {
        public static void main(String[] args) {
            String[] studentName = {"학생1", "학생2"};
            int[] stduedn1Age = {15,16};
            int[] studentGrade = {90,80};
    
            for(int i=0; i<studentName.length; i++){
                System.out.println("이름: " + studentName[i]+ " 나이:" + stduedn1Age[i] + " 성적: "+studentGrade[i]);
            }
        }
}
