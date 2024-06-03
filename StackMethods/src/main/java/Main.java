import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(25);
        numbers.push(5);
        numbers.push(2);
        numbers.push(225);
        numbers.push(251);

        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.search(2));
        System.out.println(numbers.pop());
    }
}
