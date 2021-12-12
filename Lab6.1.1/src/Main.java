import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first deck:");
        Queue<Integer> st1 = new LinkedList<Integer>();
        int tmp;
        for (int i = 0; i < 5; i++) {
            tmp = scanner.nextInt();
            st1.add(tmp);
        }
        System.out.println("Enter the second deck:");
        Queue<Integer> st2 = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            tmp = scanner.nextInt();
            st2.add(tmp);
        }
        int count = 0;
        while (!st1.isEmpty()&&!st2.isEmpty()){
            System.out.println(st1);
            System.out.println(st2);
            if ((st1.peek() > st2.peek()) && st2.peek() != 0) {
                st1.add(st1.poll());
                st1.add(st2.poll());
            } else {
                st2.add(st1.poll());
                st2.add(st2.poll());
            }
            count++;
            if(count>105){
                System.out.println("botva\n");
                return;
            }
        }
        if(st1.isEmpty()) System.out.println("Second "+count);
        else System.out.println("First "+count);
    }
}
