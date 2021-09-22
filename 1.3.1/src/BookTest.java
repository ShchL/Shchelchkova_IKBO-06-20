public class BookTest {
    public static void main(String[] args) {
        Book B1 = new Book("О дивный новый мир", "Олдос Хаксли", 1932);
        System.out.println(B1.toString());

        Book B2 = new Book();
        System.out.println(B2.toString());

        Book B3 = new Book();
        try {
            B3.setTitle("Искусство любить");
            B3.setAuthor("Эрих Фромм");
            B3.setPublicationDate(1956);
        } catch (Exception exception){
            System.out.println(exception);
            System.exit(0);
        }
        System.out.println(B3.toString());

        Book B4 = new Book();
        try {
            B4.setTitle("");
            B4.setAuthor("");
            B4.setPublicationDate(0);
        } catch (Exception exception){
            System.out.println(exception);
            System.exit(0);
        }
        System.out.println(B4.toString());
    }
}
