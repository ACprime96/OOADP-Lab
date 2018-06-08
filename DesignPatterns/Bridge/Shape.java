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
public abstract class Shape {
    Color color;
    public Shape(Color c){
        this.color=c;
    }
    public abstract void applyColor();
}
