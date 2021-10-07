public class Main {

    public static void factorization(int n, int k) {   //7. Разложение на множители
        // k - дополнительный параметр. При вызове должен быть равен 2
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            factorization(n / k, k);
        }
        else {
            factorization(n, ++k);
        }
    }

    public static int withoutTwoZeros(int a, int b) {   // 9. Без двух нулей
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return withoutTwoZeros(a, b - 1) + withoutTwoZeros(a - 1, b - 1);
    }

    public static int invertedNumber(int n) {   //15. Цифры числа справа налево
        if (n < 10) {
            return n;
        } else {
            System.out.print(n % 10 + " ");
            return invertedNumber(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("Разложение на множители");
        factorization(60, 2);
        System.out.println("Без двух нулей");
        System.out.println(withoutTwoZeros(2, 5));
        System.out.println("Цифры числа справа налево");
        System.out.println(invertedNumber(945713));
    }
}