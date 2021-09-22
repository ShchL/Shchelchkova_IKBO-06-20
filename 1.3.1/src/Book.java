public class Book {
    private String title;
    private String author;
    private int publicationDate;

    public Book(String str1, String str2, int n){
        title = str1;
        author = str2;
        publicationDate = n;
    }

    public Book(){
        title = "Убить пересмешника";
        author = "Харпер Ли";
        publicationDate = 1960;
    }

    public void setPublicationDate(int publicationDate) throws Exception{
        this.publicationDate = publicationDate;
    }

    public void setTitle(String title) throws Exception{
        if(title.isEmpty()) throw new Exception("Строка пустая");
        this.title = title;
    }

    public void setAuthor(String author) throws Exception{
        if(author.isEmpty()) throw new Exception("Строка пустая");
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public String toString(){
        return this.title+" написал(а) "+this.author+ " в " + this.publicationDate;
    }
}
