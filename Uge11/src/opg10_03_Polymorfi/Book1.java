package opg10_03_Polymorfi;

public class Book1 extends ReadingMatter
{
   private String author;
    
   public Book1 (String thisTitle, long isbnNum, String auth)
   {
      super(thisTitle,isbnNum);
      author = auth;
   }
   @Override
   public String toString()
   {
      return super.toString() + author;
   }
   public void content()
   {
      System.out.println ("Title: " + title);
      System.out.println ("ISBN: " + isbn);
      System.out.println ("Author: " + author);
   }
}