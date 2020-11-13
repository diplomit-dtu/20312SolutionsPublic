package opg10_03_Polymorfi;

public class Magazine1 extends ReadingMatter
{
    private int weeknumber;
 
    public Magazine1 (String thisTitle, long isbnNum, int weeknumber1)
    {
        super(thisTitle, isbnNum);
        weeknumber = weeknumber1;
    }
    @Override
    public String toString()
    {
        String result = super.toString() + weeknumber;
        return result;
    }
 
    public void content()
    {
        System.out.println ("Title: " + title);
        System.out.println ("ISBN: " + isbn);
        System.out.println ("Weeknumber: " + weeknumber);
    }
}