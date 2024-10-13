import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        scanner.nextLine();

        String input = scanner.nextLine();
            int result = 0;
            Stack<Character> stack = new Stack<>();

            for (int i=0 ; i<input.length() ; i++) {
                char ch = input.charAt(i);
                if ('1' <= ch && ch <= '9') {
                    result++;
                } else if (ch == 'L' || ch == 'S') {
                    if (!stack.empty() && stack.peek() != ch) {
                        stack = new Stack<>();
                    }
                    stack.push(ch);
                } else if (ch == 'R' || ch == 'K') {
                    if (ch == 'R') {
                        if (!stack.empty() && stack.peek() == 'L') {
                            result++;
                            stack.pop();
                        } else {
                            stack = new Stack<>();
                        }
                    } else if (ch == 'K') {
                        if (!stack.empty() && stack.peek() == 'S') {
                            result++;
                            stack.pop();
                        } else {
                            stack = new Stack<>();
                        }
                    }
                }
            }
            System.out.println(result);
        scanner.close();
    }
}