/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author adityachandra
 */
public class Main {
    public static void main(String[] args) {
        Shape s1=new Circle(new BlueColor());
        Shape s2=new Square(new RedColor());
        s1.applyColor();
        s2.applyColor();
    }
}
