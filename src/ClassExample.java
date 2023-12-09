public class ClassExample {
    private int maxSpead;
    private String color;
    private String brand;
    //KOnstruktoret
    public ClassExample(int maxSpead,String color, String brand){
        this.maxSpead = maxSpead;
        this.color = color;
        this.brand = brand;
    }

    //Seters
    public void setMaxSpead(int maxSpead) {
        this.maxSpead = maxSpead;
    }

    public void setColor(String color1) {
        color = color1;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //Getters
    public int getMaxSpead() {
        return maxSpead;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void printAllFields() {
        System.out.println("Max speed is: " + maxSpead + ", color is: " + color + ",drand is: " + brand);
    }
}
