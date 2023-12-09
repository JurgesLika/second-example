package Excs;

public class Rectangle {
    private int a;

    private int b;

    public Rectangle(int a , int b){
        this.a = a;
        this.b = b;
    }

    public int getArea(){
        return a * b;
    }
    public int getPerimeter(){
        return 2*(a + b);
    }
}
