public class Book {
public static void main(String[] args) {
    System.out.println("=======================");
    BookLoan B = new BookLoan();
    System.out.println(B);

    System.out.println("=======================");

    BookLoan B1 = new BookLoan("Discrete Mathematics" , "B0108" , "Kenneth H. Rosen");
    System.out.println(B1);
    System.out.println("Borrowed Status: "+ B1.borrowBook());
    System.out.println( "Is Available now?: "+ B1.isAvailable());
    System.out.println( "Returned Status: "+ B1.returnBook());
    System.out.println( "Is Available now?: "+ B1.isAvailable());

    System.out.println("=======================");

    BookLoan B2 = new BookLoan("Getting Started with C++" , "B4001", "");
    System.out.println(B2);
    System.out.println("Borrowed Status: "+ B2.borrowBook());
    System.out.println("Borrowed Status: "+ B2.borrowBook()); 
    System.out.println( "Is Available now?: "+ B2.isAvailable());
    System.out.println( "Returned Status: "+ B2.returnBook());
    System.out.println( "Is Available now?: "+ B2.isAvailable());

    System.out.println("=======================");

}
}
