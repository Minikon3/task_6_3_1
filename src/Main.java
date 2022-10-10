public class Main {
    public static void main(String[] args) {
        Printable books[] = {
                new Book("wewe","author1"),
                new Book("123","author2"),
                new Book("name","aaaaauthor"),
        };
        for (int i=0;i< books.length;i++){
            books[i].print();
        }
    }
}