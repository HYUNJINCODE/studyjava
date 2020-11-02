package studyjava;

public class MathExam {
    public static void main(String[] args) {
        int value1 =Math.max(1,2);
        //메스클래스는 생성자가private 이다
        System.out.println(value1);
        int value2 = Math.min(1,2);
        System.out.println(value2);

        System.out.println(Math.abs(-10));
        //메서드가 값을 리턴하므로그냥 찍기

        System.out.println(Math.random());
        //0부터 1.0미만의 랜덤한 값
        System.out.println(Math.sqrt(4));
        //제곱급을 구해서 리턴.
    }
}
