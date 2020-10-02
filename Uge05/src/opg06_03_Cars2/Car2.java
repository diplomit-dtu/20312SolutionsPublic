package opg06_03_Cars2;

public class Car2 {
    private static int nextRegno = 1; //static angiver klasse variabel
     
    private String brand;
    private String licenseplate; //unique identifier
    private String color;
    private int regno;
     
    public int getRegno() {
        return regno;
    }
 
    public Car2(String name, String licensplate, String color){
        this.brand = name;
        this.licenseplate = licensplate;
        this.color = color;
        this.regno = Car2.nextRegno;
        Car2.nextRegno++;
    }
     
    public String toString(){
        return "["+licenseplate+"] "+color+" "+brand;
    }
     
    public boolean equals(Car2 other){
        return this.licenseplate.equals(other.getLicenseplate());
    }
    public boolean alike(Car2 other){
        return this.brand.equals(other.getBrand()) && this.color.equals(other.getColor());
    }
    public void setBrand(String name) {
        this.brand = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setLicenseplate(String licensplate) {
        this.licenseplate = licensplate;
    }
    public String getLicenseplate() {
        return licenseplate;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public static int getNextRegno() {
        return nextRegno;
    }
 
}