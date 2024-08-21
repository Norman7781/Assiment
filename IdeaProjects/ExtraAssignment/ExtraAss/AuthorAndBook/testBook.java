package AuthorAndBook;

public class testBook {
    public static void main(String[] args) {
        Author teck = new Author("Tan Ah Teck","teck@somewhrere.com",'m');
        System.out.println(teck);

        Book dummyBook = new Book("Java for dummies",teck,9.99,88);
        System.out.println(dummyBook);

        Author teck2 =new Author("Peter Lee","peter@nowhre.com",'m');
        Book moreDummyBook = new Book("Java for dummies",teck2,19.99,88);
        System.out.println(moreDummyBook);

    }
}
