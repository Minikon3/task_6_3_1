public class Book implements Printable{
    private String author;
    private String name;
    Book(String name, String author){
        this.name=name;
        this.author=author;
    }
    @Override
    public void print() {
        System.out.println("Книга: "+getName()+"; Автор: "+getAuthor());
    }
    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
