package Stack;
import java.util.*;

public class Rev_Stack {
    public static void pushAtBottom(Stack<Integer> S, int data) {
        if (S.isEmpty()) {
            S.push(data);
            return;
        }
        int top = S.pop();
        pushAtBottom(S, data);
        S.push(top);
    }

    public static void reverseStack(Stack<Integer> S) {
        if (S.isEmpty()) {
            return;
        }
        int top = S.pop();
        reverseStack(S);
        pushAtBottom(S,top);
    }

    public static void printStack(Stack<Integer> S) {
        while (!S.isEmpty()) {
            System.out.println(S.pop());
        }
    }
    public static void main(String[] args) {
      Stack<Integer> S = new Stack<>();
      S.push(1);
      S.push(2);
      S.push(3);
      S.push(4);

      reverseStack(S);
      printStack(S);
    }
}
