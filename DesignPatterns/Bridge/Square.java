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
public class Square extends Shape {
    public Square(Color c) {
        super(c);
    }
    @Override
    public void applyColor(){
        System.out.print("Square filled with color :");
        color.applyColor();
    }
}
