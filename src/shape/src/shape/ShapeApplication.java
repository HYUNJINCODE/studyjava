package shape;

import java.util.Scanner;

public class ShapeApplication {

    private int capacity = 10;
    private Shape[] shapes = new Shape[capacity];
    private int n = 0;
    private Scanner kb = new Scanner(System.in);

    public void processCommand() {
        while (true) {
            System.out.print("$ ");
            String command = kb.next();
            if(command.equals("add")) {
                handleAdd();
            }
            else if(command.equals("show")|| command.equals("showdetail")) {
                handleShow(command.equals("showdetail"));
            }
            else if (command.equals("sort")) {
                bubbleSort(shapes,n);
            }
            else if(command.equals("exit")) {
                break;
            }
        }
        kb.close();
    }

    private void handleShow(boolean detailed) {
        for (int i=0; i<n; i++) {
            System.out.println((i+1)+". "+ shapes[i].toString());
            if(detailed) {
                System.out.println("    The area is "+shapes[i].computerArea());
                System.out.println("    The perimeter is "+ shapes[i].computerPerimeter());
            }
        }

    }

//    private void bubbleSort() {
//        for(int i=n-1; i>0; i--) {
//            for (int j= 0; j<i; j++){
//                if (shapes[j].computerArea()>shapes[j+1].computerArea()) {
//                    Shape tmp = shapes[j];
//                    shapes[j] = shapes[j+1];
//                    shapes[j+1] = tmp;
//                }
//            }
//        }
//    }
    private void bubbleSort(MyComparable[] data, int size) {
        for(int i=size-1; i>0; i--) {
            for (int j= 0; j<i; j++){
                if (data[j].compareTo(data[j+1])>0) {
                    MyComparable tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }
    }
    //버블소팅을 generic 하게 만듦. 마이컴패러블을 상속시켜서 다형성으로 인해서 data(일반적인)값
    //일반적으로 보이지만 shape클래스가 상속받기 때문에 shape객체들을 배열에 넣을 수 있음 (다형성)


    private void handleAdd() {
        String type = kb.next();
        switch (type) {
            case "R":
                int w = kb.nextInt();
                int h = kb.nextInt();
                Rectangle r = new Rectangle(w,h);
                addShape(r);
                break;
            case "C":
                addShape(new Circle(kb.nextInt()));
                break;
            case "T":
                //omitted
                break;
        }
    }

    private void addShape(Shape shape) {
        if(n>= capacity) {
            reallocate();
        }
        shapes[n++] = shape;
    }

    private void reallocate() {
        capacity*=2;
        Shape[] tmp =new Shape[capacity];
        System.arraycopy(shapes,0,tmp,0,shapes.length);
        shapes =tmp;
    }

    public static void main(String[] args) {
        ShapeApplication app = new ShapeApplication();
        app.processCommand();
    }
}
//generic하다?
//generic하지않다. 근본적으로 알고리즘의로직이 같은데 데이터의 타입이 다를뿐
//매번 새로운 것을 만들어야한다 generic하지않음
//generic 일반적인프로그래밍을해야징
//sorting algorithm 을 코드의 재사용
//코드 재사용! code reuse
//한번 만들어놓고 그 알고리즘을 적용.
//제네릭프로그래밍드디어먼소린지알았다.
//generic하게 만들고 어떤타입이든 그걸로 가능하게.
//크기 정할때 comparable
//array.sort generic한 method.
//comparable interface 구현해야함.