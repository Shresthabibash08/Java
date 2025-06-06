package Inheritance;

class Book{
    private String bookTitle;
    private String bookAuthor;
//Constructor
public Book(String bookTitle,String bookAuthor){
    this.bookTitle=bookTitle;
    this.bookAuthor=bookAuthor;
}
public void displayDetails(){
    System.out.println("Book Title:"+bookTitle+", Book Author:"+bookAuthor);
}
}

class  FictionBook extends Book{
    FictionBook(String bookTitle,String bookAuthor){
        super(bookTitle,bookAuthor);
    }
}
class NonFictionBook extends Book{
    NonFictionBook(String bookTitle,String bookAuthor){
        super(bookTitle,bookAuthor);
    }
}
class TechnicalBook extends Book{
    TechnicalBook(String bookTitle,String bookAuthor){
        super(bookTitle,bookAuthor);
    }
}
public class Books {
    public static void main(String[]args){
        FictionBook fictionBook=new FictionBook("To Kill a Mockingbird","Harper Lee");
        fictionBook.displayDetails();
        NonFictionBook nonFictionBook=new NonFictionBook("A Brief History of Humankind","Yuval Noah Harari");
        nonFictionBook.displayDetails();
        TechnicalBook techincalBook=new TechnicalBook("Introduction to Algorithms"," Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein");
        techincalBook.displayDetails();
    }
}
