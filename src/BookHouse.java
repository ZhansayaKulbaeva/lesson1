public class BookHouse {
    Book[] books = new Book[5];
    int size = 0;

    public void addBook(Book book){
        books[size] = book;
        size++;
    }

    public  void printBooks(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i].getData());
        }
    }

    public void searchBook(String name){
        boolean foundFlag = false;
        for (int i = 0; i < size; i++) {
            if (books[i].bookName.equals(name)) {
                System.out.println(books[i].getData());
                foundFlag = true;
                break;
            }
        }

        if (foundFlag==false){
            System.out.println("Book not found");
        }
    }
}
