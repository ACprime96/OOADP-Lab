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
public class Circle extends Shape {
    public Circle (Color c){
        super(c);
    }
    @Override
    public void applyColor(){
        System.out.print("Circle filled with color:");
        color.applyColor();
    }
}
