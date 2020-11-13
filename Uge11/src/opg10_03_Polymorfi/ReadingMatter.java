package opg10_03_Polymorfi;

public class ReadingMatter {
	 
    protected String title;
    protected long isbn;
 
    public ReadingMatter(String title, long isbn) {
        this.title=title;
        this.isbn=isbn;
    }
    @Override
    public String toString() {
        return title + "\t" + isbn + "\t";
    }
 
}