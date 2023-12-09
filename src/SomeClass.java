import example.PackageExample;

import java.util.Scanner;

public class SomeClass {
    public static ClassExample example = new ClassExample(206,"blue","BMW");
    public static ClassExample secondexample = new ClassExample(200,"red","ferari");


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        example.setMaxSpead(200);
        example.setBrand("Ferari");
        example.setColor("Red");
        System.out.println(example.getMaxSpead());
        example.printAllFields();

        PackageExample packageExample = new PackageExample();
        packageExample.setSomeNumber(5);
        System.out.println(packageExample.getSomeNumber());

    }
}
