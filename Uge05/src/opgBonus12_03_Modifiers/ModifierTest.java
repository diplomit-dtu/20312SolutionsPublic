package opgBonus12_03_Modifiers;

public class ModifierTest {
    ///The four visibility modifiers:
    private String string1 = "String1 text"; //Private - Only accessible to own class/object/inner classes
    protected String string2 = "String2 text"; //Protected - Accessible to children
    String string3 = "String3 text";//Default - Accessible to package members
    public String string4 = "String4 text"; //Public - Accessible within package
    //Static modifier - common to all instances
    public static String string5 = "String5 text";
    // final - unchangeable
    public final String string6 = "String6 text";
     
    public String getString1() {
        return string1;
    }
    public void setString1(String string1) {
        this.string1 = string1;
    }
 
}