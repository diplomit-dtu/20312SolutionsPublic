package opg06_02_Cars;

public class Car {
    private String brand;
    private String licenseplate; //unique identifier
    private String color;
     
    public Car(String name, String licensplate, String color){
        this.brand = name;
        this.licenseplate = licensplate;
        this.color = color;
    }
     
    public String toString(){
        return "["+licenseplate+"] "+color+" "+brand;
    }
     
    public boolean equals(Car other){
        return this.licenseplate.equals(other.getLicenseplate());
    }
    public boolean alike(Car other){
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
}
