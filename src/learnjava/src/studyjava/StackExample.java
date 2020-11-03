package studyjava;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinbox = new Stack<>();
        coinbox.push(new Coin(100));
        coinbox.push(new Coin(50));


        while(!coinbox.isEmpty()) {
            Coin coin = coinbox.pop();
            System.out.println("꺼내온 동전: "+coin.getValue());
        }
    }
}
