package opgBonus12_04_Singleton;

public class Singleton {
    private static Singleton instance;//Lazy initialization
//  private static Singleton instance = new Singleton;//Eager initialization
    private String string = "unique string";
     
    private Singleton(){
    }
    public static Singleton getInstance(){ //Should be synchronized in multithreaded environment
        if (instance == null) instance = new Singleton();
        return instance;    
    }
    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }
 
}