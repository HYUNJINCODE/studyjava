package studyjava;

public class WrapperExam {
    public static void main(String[] args) {
        int i= 5;
        Integer i2 = new Integer(5);
        //wrapper
        //primitive type i
        Integer i3 = 5;
        //프리미티브데이터를 넣었는데 그냥 작동
        //자동으로 인티저로 형변환
        //autoboxing
        //기본 데이터를 객체 타입의 데이터로 자동 형변환 시켜주는 기능
        //5 를 new Integer(5) 로 생각
        int i4 =i3.intValue();
        //원래이렇게 객체를 벗겨야함
        int i5 = i3;
        //auto unboxing
        //오토박싱이랑 반대로 객체 타입의 데이터를 기본형 타입 데이터로 자동 형변환
    }
}
