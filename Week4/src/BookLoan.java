

public class BookLoan {
    private String title= "No Book Selected ", author= "Not fetched", bookCode = "Not fetched";
    private boolean loaned_Status=false;

    BookLoan(){}
    BookLoan(String title, String bookCode,String author){
        if (title==null || title.isBlank())
        {
            this.title = "No Book Selected";
        } else{
            this.title = title;
        } 
        
        if (bookCode==null || bookCode.isBlank()){
            this.bookCode = "Not fetched !";
        } else{
            this.bookCode = bookCode;
        } 

        if (author==null || author.isBlank()){
            this.author = "Not fetched ! ";
        } else{
            this.author = author;
        }
    }
        
    public String toString(){
            return "Title: " + title + " | Book Code: " + bookCode + " | Author: : " +  author;
        }
    boolean borrowBook()
    {
        if (!loaned_Status){
            System.out.println("Book Borrowed Successfully");
            loaned_Status=true;
            return true;
        } else {
            System.out.println("Book Already Issued !");
            return false;
        }
    }

    boolean returnBook()
    {
        if (loaned_Status){
            System.out.println("Book returned Successfully");
            loaned_Status = false;
            return true;
        } else {
            System.out.println("Book is not issued !");
            return false;
        }
    }
    boolean isAvailable()
    {
        if (loaned_Status)
        {
            return false;
        } else
        {
            return true;
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getBookCode() {
        return bookCode;
    }

    

    
}
