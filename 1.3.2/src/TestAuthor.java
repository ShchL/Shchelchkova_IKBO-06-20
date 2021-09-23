public class TestAuthor {
    public static void main(String[] args) {
        Author A1 = new Author("Thomas Blythe", "BlytheThomas@gmail.com", 'M');
        System.out.println(A1.toString());

        A1.setEmail("BlytheThomas@author.com");
        System.out.println(A1.toString());
    }
}
