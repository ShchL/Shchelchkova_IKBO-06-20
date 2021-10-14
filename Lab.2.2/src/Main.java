public class Main {

    public static void main(String[] args) {
        MyString str = new MyString("строка");
        System.out.println(str.compareTo(new MyString("ещё одна строка")));
    }
}
