import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyArrList<Integer> arrList = new MyArrList(5);
        int inp;
        Scanner scanner = new Scanner(System.in);
        inp = scanner.nextInt();
        while (inp!=-1){
            arrList.add(inp);
            inp = scanner.nextInt();
        }

        System.out.println(arrList.size());
        System.out.println(arrList.isEmpty());
        System.out.println(arrList);
        arrList.clear();
        System.out.println(arrList.isEmpty());
        System.out.println(arrList);
    }
}
